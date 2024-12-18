package com.distribuida.principal;

import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;

public class FacturaDetallePrincipal {

    public static void main(String[] args) {
        // Crear una instancia de Factura
    	Factura factura = new Factura();
        
        // Crear una instancia de Libro
        Libro libro = new Libro(
                101,                     // idLibro
                "La isla del Tesoro",         // Título
                "Editorial XYZ",          // Editorial
                200,                      // Número de páginas
                "1ª Edición",             // Edición
                "Español",                // Idioma
                new java.util.Date(),     // Fecha de publicación
                "Un clásico de la literatura americana.",  // Descripción
                "Dura",                   // Tipo de pasta
                "452-2-234567-890",       // ISBN
                50,                       // Número de ejemplares
                "portada sencilla minimalista",            // Portada
                "Tapa dura",              // Presentación
                20.0,                     // Precio
                "Aventura",                // Categoría
                "Robert Louis Stevenson",    // Autor
                null,                     // Factura (no asignada aquí)
                null                      // Libro relacionado (no asignado aquí)
        );

        // Crear una instancia de FacturaDetalle
        FacturaDetalle detalle = new FacturaDetalle(1, 3, 60.0, libro.getNum_paginas(), factura, libro);

        // Imprimir los detalles del FacturaDetalle
        System.out.println("Detalles de la Factura Detalle:");
        System.out.println(detalle);

        // También se puede imprimir la factura y el libro por separado
        System.out.println("Factura: " + factura);
        System.out.println("Libro: " + libro);
    }
}
