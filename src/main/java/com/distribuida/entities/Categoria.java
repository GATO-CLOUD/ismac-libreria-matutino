package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @Column(name = "id_categoria")
    private int idCategoria;
    
    @Column(name = "categoria")
    private String categoria;
    
    @Column(name = "descripcion")
    private String descripcion;

    // Relación uno a muchos con Libro
    @OneToMany(mappedBy = "categoria") // mappedBy indica que la relación inversa está en el atributo 'categoria' de la clase Libro
    private List<Libro> libros;

    // Constructor vacío
    public Categoria() { }

    // Constructor con parámetros
    public Categoria(int idCategoria, String categoria, String descripcion) {
        this.idCategoria = idCategoria;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    // Getters y setters
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Categoria [idCategoria=" + idCategoria + ", categoria=" + categoria + ", descripcion=" + descripcion + "]";
    }
}

