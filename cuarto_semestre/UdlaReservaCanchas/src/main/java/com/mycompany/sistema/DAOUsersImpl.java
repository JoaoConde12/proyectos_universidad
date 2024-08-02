/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema;

import com.mycompany.db.Conexion;
import com.mycompany.interfaces.DAOUsers;
import com.mycompany.models.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author dell-pc
 */
public class DAOUsersImpl extends Conexion implements DAOUsers {

    @Override
    public void registrar(Usuarios usuario) throws Exception {
        try {
            this.conectar();
            String sql = "INSERT INTO users(id_banner, username, password) VALUES (?, ?, ?)";
            PreparedStatement st = this.conexion.prepareStatement(sql);
            st.setString(1, usuario.getIdBanner());
            st.setString(2, usuario.getUsername());
            st.setString(3, new String(usuario.getPassword()));
            st.executeUpdate();
        } catch (Exception e) {
            throw new Exception("Error al registrar el usuario");
        } finally {
            this.cerrar();
        }
    }

    @Override
    public Usuarios obtenerUsuarioPorIdBanner(String idBanner) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuarios usuario = null;
        
        try {
            conn = this.conectar();
            String sql = "SELECT * FROM users WHERE id_banner = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, idBanner);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                usuario = new Usuarios();
                usuario.setIdBanner(rs.getString("id_banner"));
                usuario.setUsername(rs.getString("username"));
                usuario.setPassword(rs.getString("password"));
                usuario.setAdmin(rs.getBoolean("is_admin"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }
        return usuario;
    }
}
