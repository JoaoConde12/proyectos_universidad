package com.mycompany.models;

import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Joao Conde, Victor Suquilanda, Josue Riera, Pablo Yanez
 */
public class Usuarios {
    private String idBanner;
    private String username;
    private String password;
    private boolean isAdmin;
    
    public String getIdBanner() {
        return idBanner;
    }
    
    public void setIdBanner(String idBanner) {
        this.idBanner = idBanner;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    public boolean validarCamposRegistro() {
        if (idBanner == null || idBanner.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ID Banner vacío", "Error al registrar", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (username == null || username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nombre de usuario vacío", "Error al registrar", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (password == null || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Contraseña vacía", "Error al registrar", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public String hashPassword(String plainTextPassword) {
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
    }

    public boolean checkPassword(String plainTextPassword) {
        return BCrypt.checkpw(plainTextPassword, this.password);
    }
}
