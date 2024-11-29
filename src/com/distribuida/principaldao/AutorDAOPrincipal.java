package com.distribuida.principaldao;
 
import java.util.List;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;
 
public class AutorDAOPrincipal {
 
	  public static void main(String[] args) {
	        // Cargar el contexto de Spring
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	 
	        // Obtener el bean de AutorDAO desde el contexto de Spring
	        AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);
	 
	 
	        // INSERT (Crear un nuevo autor)
	        //Autor autor = new Autor(48, "Isabel", "Allende", "Chile", "Av.Misterio", "123456789", "isabelita@mail.com");
	        //autorDAO.add(autor);  // Descomentar para insertar el autor en la base de datos
	 
	        // UPDATE (Actualizar un autor existente)
	        Autor autor2 = new Autor(48, "Edgar Allan ", "Poe", "Argentina", "Estadio de Boca", "1212584868", "poe@mail.com");
	        autorDAO.up(autor2);  // Descomentar para actualizar el autor con ID 1
	 
	        // FIND ONE (Buscar un autor por ID)
	        //try {
	          //  Autor autor3 = autorDAO.findOne(1);  // Buscar autor con ID 1
	            //System.out.println(autor3.toString());
	        //} catch (Exception e) {
	          //  e.printStackTrace();
	        //}
	 
	        // DELETE (Eliminar un autor por ID)
	        //autorDAO.del(1);  // Descomentar para eliminar el autor con ID 1
	 
 
        // FIND ALL (Obtener todos los autores)
        List<Autor> autores = autorDAO.findAll();
        for (Autor item : autores) {
            System.out.println(item.toString());
        }
 
        // Cerrar el contexto de Spring
        context.close();
    }
}