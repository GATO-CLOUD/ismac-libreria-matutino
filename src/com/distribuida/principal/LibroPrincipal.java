package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Libro;

public class LibroPrincipal {

    public static void main(String[] args) {
        // Crear una fecha para la publicación (puedes usar la fecha actual o una específica)
        Date fechaPublicacion = new Date(); // Fecha actual como ejemplo

        // Crear un libro con los atributos necesarios
        Libro libro = new Libro(
                1,                       // idLibro
                "La isla del tesoro",   // Título
                "Editorial XYZ",          // Editorial
                417,                      // Número de páginas
                "1ª Edición",             // Edición
                "Español",                // Idioma
                fechaPublicacion,         // Fecha de publicación
                "Una novela trágica de Robert Louis Stevenson.",  // Descripción
                "Dura",                   // Tipo de pasta
                "955-6-13-128313-0",      // ISBN
                100,                      // Número de ejemplares
                "portada sencilla minimalista",            // Portada (archivo de imagen como ejemplo)
                "Tapa dura",              // Presentación
                25.50,                    // Precio
                "Aventura",                // Categoría
                "Robert Louis Stevenson", // Autor
                null,                     // Factura (por ahora no se asigna)
                null                      // Libro (por ahora no se asigna)
        );

        // Imprimir los detalles del libro
        System.out.println("Detalles del Libro:");
        System.out.println(libro);

    }
}