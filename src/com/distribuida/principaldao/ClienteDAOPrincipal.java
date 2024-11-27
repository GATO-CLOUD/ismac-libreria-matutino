package com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class ClienteDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
		
		// Insert 
		Cliente cliente = new Cliente(0,"1768243692","Ernersto","Carrera","Quito","098534628","cosa@correo.com");
		//clienteDAO.add(cliente);;
		
		// update 
				Cliente cliente2 = new Cliente(39,"1768289732","Ebaristo","Carson","Quito","098534666","cosapost@correo.com");
				//clienteDAO.up(cliente2);
		
		//findOne
		try {
			Cliente cliente3 = clienteDAO.findOne(39);		
			System.out.println(cliente3.toString());
		
		}catch(Exception e) {
			//TODO: handle exception
			e.printStackTrace();
		}
					//delete
		//clienteDAO.del(39);		
				
				
		
		//findAll
		List<Cliente> clientes = clienteDAO.findAll();
		
		for (Cliente item : clientes) {
			System.out.println(item.toString());
		}
		
		context.close();
		
	}

}