/**
 * 
 */
package com.web.es.ordenpago.repositorio.modelo;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author cgarcia
 *
 */

@Entity
@Table(name = "ordenpago")
public class OrdenPago implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	@Column(name = "nombreArticulo")
	private String nombreArticulo;

	@Column(name = "precio")
	private double precio;

	@Column(name = "unidadArticulo")
	private int unidadArticulo;

	@Column(name = "codigoArticulo")
	private String codigoArticulo;

	@Column(name = "codigoCLiente")
	private String codigoCLiente;
	
	@Column(name = "fechaRegistro")
	private Date fechaRegistro;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
