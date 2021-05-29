/**
 * 
 */
package com.web.articullo.controler.dto;

/**
 * @author cgarcia
 *
 */
public class ArticuloDTO {

	private String nombre;
	private int cantidad;
	private double precio;
	private int stop;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStop() {
		return stop;
	}

	public void setStop(int stop) {
		this.stop = stop;
	}

}
