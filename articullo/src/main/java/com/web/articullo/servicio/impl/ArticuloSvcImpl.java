/**
 * 
 */
package com.web.articullo.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.web.articullo.repositorio.ifc.IArticuloRepo;
import com.web.articullo.repositorio.model.Articulo;
import com.web.articullo.servicio.ifc.IArticuloSvc;

/**
 * @author cgarcia
 *
 */

@Service
public class ArticuloSvcImpl implements IArticuloSvc {

	@Autowired
	IArticuloRepo respo;

	@Override
	public ResponseEntity<?> consultaArticulo() {
		// TODO Auto-generated method stub

		List<Articulo> listaArticulo = respo.findAll();

		return new ResponseEntity<>(listaArticulo, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> actualizarArticulo(List<Articulo> body) {
		// TODO Auto-generated method stub
		
		List<Articulo> listaArticulo = respo.saveAll(body);
		return new ResponseEntity<>(listaArticulo, HttpStatus.OK);
	}
	

}
