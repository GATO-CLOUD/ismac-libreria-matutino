package com.distribuida.entities;

public class FacturaDetalle {

	private int idFacturaDetalle;
	private double cantidad;
	private double subtotal;
	private double num_paginas;
	private Factura factura;
	private Libro libro;

	public FacturaDetalle() { }

	public FacturaDetalle(int idFacturaDetalle, double cantidad, double subtotal, double num_paginas, Factura factura,
			Libro libro) {
	
		this.idFacturaDetalle = idFacturaDetalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.factura = factura;
		this.libro = libro;
	}

	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}

	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getNum_paginas() {
		return num_paginas;
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
		return "FacturaDetalle [idFacturaDetalle=" + idFacturaDetalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", num_paginas=" + num_paginas + ", factura=" + factura + ", libro=" + libro + "]";
	}
}
	