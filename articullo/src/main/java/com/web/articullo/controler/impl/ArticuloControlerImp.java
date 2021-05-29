/**
 * 
 */
package com.web.articullo.controler.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.articullo.controler.ifc.IArticuloControler;
import com.web.articullo.repositorio.model.Articulo;
import com.web.articullo.servicio.ifc.IArticuloSvc;

/**
 * @author cgarcia
 *
 */

@RestController
@RequestMapping("/api/es")
@CrossOrigin("*")
public class ArticuloControlerImp implements IArticuloControler {

	@Autowired
	IArticuloSvc servi;
	
	@Override
	public ResponseEntity<?> consultaArticulo() {
		// TODO Auto-generated method stub
		return servi.consultaArticulo();
	}

	@Override
	public ResponseEntity<?> actualizarArticulo(List<Articulo> body) {
		// TODO Auto-generated method stub
		return servi.actualizarArticulo(body);
	}

}
