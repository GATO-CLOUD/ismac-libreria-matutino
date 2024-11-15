package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class FacturaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente(1,"1728369270","Jose","Perez","Tumbaco","098546317","algo@mail.com");
		
		Factura factura = new Factura();
		
		factura.setIdFactura(1);
		factura.setFecha(new Date());
		factura.setNumfactura("FAC-0001");
		factura.setTotalNeto(25.36);
		factura.setIva(15.25);
		factura.setTotal(116.25);
		
		//Inyección de dependecia
		
		factura.setCliente(cliente);
		
		System.out.println(factura.toString());
		
		
		
	}

}
