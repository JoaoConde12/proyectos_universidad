package com.mycompany.models;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Joao Conde, Victor Suquilanda, Josue Riera, Pablo Yanez
 */
public class Reservas {
    private int idReserva;
    private String idBanner;
    private Date fecha;
    private Time horaInicio;
    private Time horaFin;
    private int canchaID;
    private int numeroPersonas;

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    
    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }
    
    public String getIdBanner() {
        return idBanner;
    }

    public void setIdBanner(String idBanner) {
        this.idBanner = idBanner;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public int getCanchaID() {
        return canchaID;
    }

    public void setCanchaID(int canchaID) {
        this.canchaID = canchaID;
    }    
    
    public boolean validarCamposRegistro() {
        Calendar ahora = Calendar.getInstance();
        Calendar fechaReserva = Calendar.getInstance();
        fechaReserva.setTime(fecha);
        
        if (fecha == null) {
            JOptionPane.showMessageDialog(null, "La fecha no puede estar vacía", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (horaInicio.compareTo(horaFin) >= 0) {
            JOptionPane.showMessageDialog(null, "La hora de inicio no puede ser menor a la hora de fin", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (fechaReserva.get(Calendar.YEAR) == ahora.get(Calendar.YEAR) &&
            fechaReserva.get(Calendar.DAY_OF_YEAR) == ahora.get(Calendar.DAY_OF_YEAR)) {
            Time horaActual = new Time(ahora.get(Calendar.HOUR_OF_DAY), ahora.get(Calendar.MINUTE), ahora.get(Calendar.SECOND));
            if (horaInicio.compareTo(horaActual) <= 0) {
                JOptionPane.showMessageDialog(null, "La hora de inicio debe ser mayor a la hora actual", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        
        if (numeroPersonas == 0) {
            JOptionPane.showMessageDialog(null, "El número de personas no puede ser 0", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
}
