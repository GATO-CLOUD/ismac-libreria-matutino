package com.distribuida.entities;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;  // Importa la anotación @Id
import javax.persistence.Table;
 
@Entity
@Table(name = "autor")
public class Autor {
    // Atributos
    @Id  // Asegúrate de marcar este atributo como la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_autor")
    private int id_autor;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "apellido")
    private String apellido;
    @Column (name = "pais")
    private String pais;
    @Column (name = "direccion")
    private String direccion;
    @Column (name = "telefono")
    private String telefono;
    @Column (name = "correo")
    private String correo;
    // Constructor vacío
    public Autor() {}
 
    // Constructor con parámetros
    public Autor(int id_autor, String nombre, String apellido, String pais, String direccion, String telefono,
            String correo) {
        this.id_autor = id_autor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }
 
    // Getters y Setters
    public int getId_autor() {
        return id_autor;
    }
 
    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getApellido() {
        return apellido;
    }
 
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
 
    public String getPais() {
        return pais;
    }
 
    public void setPais(String pais) {
        this.pais = pais;
    }
 
    public String getDireccion() {
        return direccion;
    }
 
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
 
    public String getTelefono() {
        return telefono;
    }
 
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
 
    public String getCorreo() {
        return correo;
    }
 
    public void setCorreo(String correo) {
        this.correo = correo;
    }
 
    // Método toString
    @Override
    public String toString() {
        return "Autor [id_autor=" + id_autor + ", nombre=" + nombre + ", apellido=" + apellido + ", pais=" + pais
                + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + "]";
    }
}