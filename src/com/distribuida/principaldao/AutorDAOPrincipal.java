package com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class AutorDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorDAO autorDAO = context.getBean("autorDAOImpl",AutorDAO.class);
		
		// Insert 
		Autor autor = new Autor(48,"Mario","Perez","Dinamarca","Av.El mas allá","095489167","pluma@correo.com");
		autorDAO.add(autor);;
		
		// update 
				Autor autor2 = new Autor(0,"Isabel","Allenede","Chile","Av.el dragon","094087156","isabelita@correo.com");
				//autorDAO.up(autor2);
		
		//findOne
		try {
			Autor autor3 = autorDAO.findOne(39);		
			System.out.println(autor3.toString());
		
		}catch(Exception e) {
			//TODO: handle exception
			e.printStackTrace();
		}
					//delete
		//clienteDAO.del(39);		
				
				
		
		//findAll
		List<Autor> autores = autorDAO.findAll();
		
		for (Autor item : autores) {
			System.out.println(item.toString());
		}
		
		context.close();
		
	}

}
