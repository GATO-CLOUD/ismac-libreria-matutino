package com.distribuida.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "factura_detalle")
public class FacturaDetalle {
  
	// SQL:         1:1 <=> Java: @OneToOne
	// SQL:         1:N <=> Java: @OneToMany , @ManyToOne
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_factura_detalle")
	private int idFactura;
	@Column(name = "num_factura")
	private String numfactura;
	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "total_neto")
	private Double totalNeto;
	@Column(name = "iva")
	private Double iva;
	@Column(name = "total")
	private Double total;
	// private int idCliente;



	@JoinColumn(name = "id_factura")
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Factura factura;
	
	@JoinColumn(name = "id_libro")
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})	
	private Libro libro; 

	public FacturaDetalle() { }

	public FacturaDetalle(int idFacturaDetalle, double cantidad, double subtotal, double num_paginas, Factura factura,
			Libro libro) {
	

		this.factura = factura;
		this.libro = libro;
	}




	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "FacturaDetalle [idFactura=" + idFactura + ", numfactura=" + numfactura + ", fecha=" + fecha
				+ ", totalNeto=" + totalNeto + ", iva=" + iva + ", total=" + total + ", factura=" + factura + ", libro="
				+ libro + "]";
	}


}
	