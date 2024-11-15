package com.distribuida.entities;

import java.util.Date;

public class Factura {
  
	private int idFactura;
	private String numfactura;
	private Date fecha;
	private Double totalNeto;
	private Double iva;
	private Double total;
	// private int idCliente;
	private Cliente cliente;
	
	public Factura() { }
	
	public Factura(int idFactura, String numfactura, Date fecha, Double totalNeto, Double iva, Double total,
			Cliente cliente) {
	
		this.idFactura = idFactura;
		this.numfactura = numfactura;
		this.fecha = fecha;
		this.totalNeto = totalNeto;
		this.iva = iva;
		this.total = total;
		this.cliente = cliente;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getNumfactura() {
		return numfactura;
	}

	public void setNumfactura(String numfactura) {
		this.numfactura = numfactura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getTotalNeto() {
		return totalNeto;
	}

	public void setTotalNeto(Double totalNeto) {
		this.totalNeto = totalNeto;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}
	// Método inyector
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", numfactura=" + numfactura + ", fecha=" + fecha + ", totalNeto="
				+ totalNeto + ", iva=" + iva + ", total=" + total + ", cliente=" + cliente + "]";
	}
	
	
	
}
