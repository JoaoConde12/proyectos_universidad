/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author dell-pc
 */
public class Contacto {
    
    private int codigo;
    private String nombre;
    private String telefono;
    private String email;
    private String ciudad;

    // Constructor
    public Contacto(int codigo, String nombre, String telefono, String email, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.ciudad = ciudad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    // Método toString que retorna un String del objeto Contacto
    @Override
    public String toString() {
        return "ID: " + getCodigo() +
               ", Nombre: " + getNombre() +
               ", Teléfono: " + getTelefono() +
               ", Email: " + getEmail() +
               ", Ciudad: " + getCiudad();
    }
}
