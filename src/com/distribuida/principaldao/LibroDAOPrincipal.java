package com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Libro;

public class LibroDAOPrincipal {

    public static void main(String[] args) {
        // Cargar el contexto de Spring desde el archivo de configuración XML
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // Obtener los beans de los DAOs desde el contexto de Spring
        LibroDAO libroDAO = context.getBean("libroDAOImpl", LibroDAO.class);
        
        // Agregar un nuevo libro
        Libro libro = new Libro();
        libro.setTitulo("El Quijote");
        libro.setPrecio(30.50);
        
        // libroDAO.add(libro); // Descomentar para agregar el libro

        // Actualizar un libro existente
        Libro libro2 = libroDAO.findOne(1); // Buscar el libro con id=1
        if (libro2 != null) {
            libro2.setPrecio(35.75); // Cambiar el precio
            libroDAO.up(libro2); // Actualizar el libro
        }

        // Eliminar un libro
        // libroDAO.delete(2); // Descomentar para eliminar el libro con id=2

        // Buscar un libro por su ID
        try {
       
        } catch (Exception e) {
            e.printStackTrace(); // Manejo de excepciones
        }

        // Buscar todos los libros
        List<Libro> libros = libroDAO.findAll(); // Obtener todos los libros
        libros.forEach(libroItem -> {
            System.out.println(libroItem.toString()); 
        });

        // Cerrar el contexto de Spring
        context.close();
    }
}
