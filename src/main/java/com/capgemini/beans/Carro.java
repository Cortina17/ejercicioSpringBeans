package com.capgemini.beans;

import java.util.Date;

public class Carro {

	Producto producto;
	Date fecha;
	double total;
	
	Carro carro() {
		return null;
	}

	Producto producto(Producto producto, Date fecha, double total) {
		this.producto = new Producto();
		this.fecha = fecha;
		this.total = total;
		return producto;

	}

	public double getTotal1() {
		return total;

	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
