package com.distribuida.principal;
 
import com.distribuida.entities.Autor;
 
public class AutorPrincipal {
 
    public static void main(String[] args) {
        //clase principal autor para gestionar la base de datos.
        Autor autor = new Autor(1, "Jaimito", "Pozo", "Panama", "Calle bonita", "584021548", "Moon@mail.com");
       
    
        System.out.println(autor.toString());
    }
}
