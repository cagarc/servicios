/**
 * 
 */
package com.web.articullo.servicio.ifc;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.web.articullo.repositorio.model.Articulo;

/**
 * @author cgarcia
 *
 */
public interface IArticuloSvc {

	public ResponseEntity<?> consultaArticulo();

	public ResponseEntity<?> actualizarArticulo(List<Articulo>  body);
}
