/**
 * 
 */
package com.web.articullo.controler.ifc;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.web.articullo.repositorio.model.Articulo;

/**
 * @author cgarcia
 *
 */
public interface IArticuloControler {

	@GetMapping(value = "consultaArticulo")
	public ResponseEntity<?> consultaArticulo();

	@PutMapping(value = "consultaArticulo")
	public ResponseEntity<?> actualizarArticulo(@RequestBody List<Articulo> body);

}
