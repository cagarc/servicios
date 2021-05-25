/**
 * 
 */
package com.web.es.ordenpago.Servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.web.es.ordenpago.Servicio.ifc.IOrdenPagoSvc;
import com.web.es.ordenpago.controler.dto.OrdenPagoDTO;
import com.web.es.ordenpago.repositorio.ifc.IOrdenPagoRepo;
import com.web.es.ordenpago.repositorio.modelo.OrdenPago;
import com.web.es.ordenpago.util.OrdenPagoConvert;

/**
 * @author cgarcia
 *
 */

@Service
public class OrdenPagoSvc implements IOrdenPagoSvc {

	@Autowired
	IOrdenPagoRepo repo;

	public ResponseEntity<?> ingresoPago(List<OrdenPagoDTO> body) {
		// TODO Auto-generated method stub

		List<OrdenPago> orden = OrdenPagoConvert.listModelTo(body);
		List<OrdenPago> respuest =repo.saveAll(orden);
		return new ResponseEntity<>(OrdenPagoConvert.listModelToDTO(respuest),HttpStatus.OK);
	}

}
