/**
 * 
 */
package com.web.es.ordenpago.controler.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.es.ordenpago.Servicio.ifc.IOrdenPagoSvc;
import com.web.es.ordenpago.controler.dto.OrdenPagoDTO;
import com.web.es.ordenpago.controler.ifc.IOrdenPagoControler;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * @author cgarcia
 *
 */

@RestController
@RequestMapping("/api/es")
@CrossOrigin("*")
public class OrdenPagoControlerImp implements IOrdenPagoControler {

	@Autowired
	IOrdenPagoSvc servicio;

	@Override
	public ResponseEntity<?> ingresoPago(@RequestBody List<OrdenPagoDTO> body) {
		// TODO Auto-generated method stub
		return servicio.ingresoPago(body);
	}

}
