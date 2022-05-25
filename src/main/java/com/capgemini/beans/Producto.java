package com.capgemini.beans;

public class Producto {

	private String nombre;
	private double precio;
	private int cantidad;
	private double subtotal;

	public Producto() {
	}

	public Producto(String nombre, double precio, int cantidad, double subtotal) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
