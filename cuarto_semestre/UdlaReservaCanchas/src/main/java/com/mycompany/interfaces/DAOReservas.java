package com.mycompany.interfaces;

import com.mycompany.models.Reservas;
import java.util.List;
/**
 *
 * @author Joao Conde, Victor Suquilanda, Josue Riera, Pablo Yanez
 */
public interface DAOReservas {
    public void crearReserva(Reservas reserva) throws Exception;
    boolean validaDisponibilidad(Reservas reserva) throws Exception;
    void cargarReservasHM();
    List<Reservas> getAllReservas();
    public List<Reservas> getReservasPorIdBanner(String idBanner);
    boolean borrarReserva(int idReserva) throws Exception;
}
