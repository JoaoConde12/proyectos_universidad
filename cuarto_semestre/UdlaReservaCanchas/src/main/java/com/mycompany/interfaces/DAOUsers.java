package com.mycompany.interfaces;

import com.mycompany.models.Usuarios;

/**
 *
 * @author Joao Conde, Victor Suquilanda, Josue Riera, Pablo Yanez
 */
public interface DAOUsers {    
    public void registrar(Usuarios usuario) throws Exception;
    public Usuarios obtenerUsuarioPorIdBanner(String idBanner) throws Exception;
}
