package com.distribuida.principal;

import com.distribuida.entities.Cliente;

public class ClientePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente(1,"1728369270","Jose","Perez","Tumbaco","098546317","algo@mail.com");
		Cliente cliente2 = new Cliente(2,"0584967912","Pepe","Sanchez","Quito","084236781","comida@gmail.com");
		
		System.out.println(cliente.toString());
		System.out.println(cliente2.toString());
	}

}
