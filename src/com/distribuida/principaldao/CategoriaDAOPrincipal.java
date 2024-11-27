package com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;

public class CategoriaDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl",CategoriaDAO.class);
		
		// Insert 
		Categoria categoria = new Categoria(9,"Programación02","Libros de programación");
		categoriaDAO.add(categoria);;
		
		// update 
				Categoria categoria2 = new Categoria(9,"Aventura01","Acción01");
				//categoriaDAO.up(categoria2);
		
		//findOne
		/*try {
			Categoria categoria3 = categoriaDAO.findOne(39);		
			System.out.println(categoria3.toString());
		
		}catch(Exception e) {
			//TODO: handle exception
			e.printStackTrace();
		}
					//delete
		//categoriaDAO.del(39);		
				
			*/
		
		//findAll
		List<Categoria> description = categoriaDAO.findAll();
		
		for (Categoria item : description) {
			System.out.println(item.toString());
		}
		
		context.close();
		
	}

}