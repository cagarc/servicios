/**
 * 
 */
package com.web.es.ordenpago.controler.dto;

import java.sql.Date;

/**
 * @author cgarcia
 *
 */
public class OrdenPagoDTO {

	private String nombreArticulo;
	private double precio;
	private int unidadArticulo;
	private String codigoArticulo;
	private String codigoCLiente;
	private Date fechaRegistro;

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getUnidadArticulo() {
		return unidadArticulo;
	}

	public void setUnidadArticulo(int unidadArticulo) {
		this.unidadArticulo = unidadArticulo;
	}

	public String getCodigoArticulo() {
		return codigoArticulo;
	}

	public void setCodigoArticulo(String codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public String getCodigoCLiente() {
		return codigoCLiente;
	}

	public void setCodigoCLiente(String codigoCLiente) {
		this.codigoCLiente = codigoCLiente;
	}

}
