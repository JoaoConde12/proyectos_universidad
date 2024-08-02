package com.mycompany.sistema;

import com.mycompany.db.Conexion;
import com.mycompany.interfaces.DAOReservas;
import com.mycompany.models.Reservas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell-pc
 */
public class DAOReservasImpl extends Conexion implements DAOReservas {

    private HashMap<String, List<Reservas>> reservasPorIdBanner;

    public DAOReservasImpl() {
        reservasPorIdBanner = new HashMap<>();
        cargarReservasHM();
    }
    
    @Override
    public void crearReserva(Reservas reserva) throws Exception {
        try {
            this.conectar();
            
            String sql = "INSERT INTO reservas(id_user, fecha, hora_inicio, hora_fin, cancha_id, numero_personas) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement st = this.conexion.prepareStatement(sql);
            st.setString(1, reserva.getIdBanner());
            st.setDate(2, new java.sql.Date(reserva.getFecha().getTime()));
            st.setTime(3, reserva.getHoraInicio());
            st.setTime(4, reserva.getHoraFin());
            st.setInt(5, reserva.getCanchaID());
            st.setInt(6, reserva.getNumeroPersonas());
            st.executeUpdate();
        } catch (Exception e) {
            throw new Exception("Error al hacer la reserva ", e);
        } finally {
            this.cerrar();
        }
    }
    
    @Override
    public boolean validaDisponibilidad(Reservas reserva) throws Exception {
        ResultSet rs = null;
        PreparedStatement st = null;
        try {
            this.conectar();
            
            String sql = "SELECT * FROM reservas WHERE fecha = ? AND ((hora_inicio < ? AND hora_fin > ?) OR (hora_inicio < ? AND hora_fin > ?))";
            st = this.conexion.prepareStatement(sql);
            st.setDate(1, new java.sql.Date(reserva.getFecha().getTime()));
            st.setTime(2, reserva.getHoraFin());
            st.setTime(3, reserva.getHoraInicio());
            st.setTime(4, reserva.getHoraFin());
            st.setTime(5, reserva.getHoraInicio());
            rs = st.executeQuery();
            
            while (rs.next()) {
                int canchaIDExistente = rs.getInt("cancha_id");
                
                if ((reserva.getCanchaID() == 1 || reserva.getCanchaID() == 2) && 
                    (canchaIDExistente == 1 || canchaIDExistente == 2 || 
                     canchaIDExistente == 3 || canchaIDExistente == 4 || 
                     canchaIDExistente == 5 || canchaIDExistente == 6)) {
                    return false;
                }
                
                if ((reserva.getCanchaID() == 3 && (canchaIDExistente == 1 || canchaIDExistente == 2 || canchaIDExistente == 3 || canchaIDExistente == 5)) || 
                    (reserva.getCanchaID() == 5 && (canchaIDExistente == 1 || canchaIDExistente == 2 || canchaIDExistente == 3 || canchaIDExistente == 5))) {
                    return false;
                }   

                if ((reserva.getCanchaID() == 4 && (canchaIDExistente == 1 || canchaIDExistente == 2 || canchaIDExistente == 4 || canchaIDExistente == 6)) || 
                    (reserva.getCanchaID() == 6 && (canchaIDExistente == 1 || canchaIDExistente == 2 || canchaIDExistente == 4 || canchaIDExistente == 6))) {
                    return false;
                }
            }
            
            return true;
        } catch (Exception e) {
            throw new Exception("Error al validar disponibilidad", e);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            this.cerrar();
        }
    }
    
    @Override
    public void cargarReservasHM() {
        List<Reservas> reservas = getAllReservas();
        for (Reservas reserva : reservas) {
            reservasPorIdBanner.computeIfAbsent(reserva.getIdBanner(), k -> new ArrayList<>()).add(reserva);
        }
    }

    @Override
    public List<Reservas> getAllReservas() {
        List<Reservas> reservas = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement st = null;

        try {
            this.conectar();
            String sql = "SELECT * FROM reservas WHERE fecha >= CURRENT_DATE ORDER BY fecha, hora_inicio";
            st = this.conexion.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Reservas reserva = new Reservas();
                reserva.setIdReserva(rs.getInt("reserva_id"));
                reserva.setIdBanner(rs.getString("id_user"));
                reserva.setFecha(rs.getDate("fecha"));
                reserva.setHoraInicio(rs.getTime("hora_inicio"));
                reserva.setHoraFin(rs.getTime("hora_fin"));
                reserva.setCanchaID(rs.getInt("cancha_id"));
                reserva.setNumeroPersonas(rs.getInt("numero_personas"));

                reservas.add(reserva);
            }
        } catch (Exception e) {
            try {
                throw new Exception("Error al obtener todas las reservas", e);
            } catch (Exception ex) {
                Logger.getLogger(DAOReservasImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAOReservasImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAOReservasImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.cerrar();
        }

        return reservas;
    }
    
    @Override
    public List<Reservas> getReservasPorIdBanner(String idBanner) {
        return reservasPorIdBanner.getOrDefault(idBanner, new ArrayList<>());
    }

    
    @Override
    public boolean borrarReserva(int idReserva) throws Exception {
        PreparedStatement st = null;
    
        try {
            this.conectar();
            String sql = "DELETE FROM reservas WHERE reserva_id = ?";
            st = this.conexion.prepareStatement(sql);
            st.setInt(1, idReserva);
        
            int rowsAffected = st.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            throw new Exception("Error al borrar la reserva", e);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAOReservasImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.cerrar();
        }
    }    
}
