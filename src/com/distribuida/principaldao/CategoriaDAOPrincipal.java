package com.distribuida.principaldao;
 
import java.util.List;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;
 
public class CategoriaDAOPrincipal {
 
    public static void main(String[] args) {
        // Cargar el contexto de Spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
 
        // Obtener el bean de CategoriaDAO desde el contexto de Spring
        CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl", CategoriaDAO.class);
 
        // INSERT (Crear una nueva categoría)
        //Categoria categoria = new Categoria(0, "Ficcion", "Aventura");
        //categoriaDAO.add(categoria);  // Descomentar para insertar la categoría en la base de datos
 
        // UPDATE (Actualizar una categoría existente)
        //Categoria categoria2 = new Categoria(1, "Aventura", "Novela");
        //categoriaDAO.up(categoria2);  // Descomentar para actualizar la categoría con ID 1
 
        // FIND ONE (Buscar una categoría por ID)
        //try {
          //  Categoria categoria3 = categoriaDAO.findOne(1);  // Buscar categoría con ID 1
            //System.out.println(categoria3.toString());
        //} catch (Exception e) {
          //  e.printStackTrace();
        //}
 
         //DELETE (Eliminar una categoría por ID)
        categoriaDAO.del(39);  // Descomentar para eliminar la categoría con ID 1
 
        // FIND ALL (Obtener todas las categorías)
        List<Categoria> categorias = categoriaDAO.findAll();
        for (Categoria item : categorias) {
            System.out.println(item.toString());
        }
 
        // Cerrar el contexto de Spring
        context.close();
    }
}
 