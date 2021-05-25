/**
 * 
 */
package com.web.es.cliente.controler.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.es.cliente.controler.dto.ClienteDTO;
import com.web.es.cliente.controler.ifc.IClienteControler;
import com.web.es.cliente.service.ifc.IClienteSvc;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * @author cgarcia
 *
 */

@RestController
@RequestMapping("/api/es")
@CrossOrigin("*")
public class ClienteControlerImp implements IClienteControler {

	@Autowired
	IClienteSvc servicio;
	
	@Override
	public ResponseEntity<?> consultaCliente() {
		// TODO Auto-generated method stub
		return servicio.consultaCliente();
	}

	@Override
	public ResponseEntity<?> actualizarCliente(@RequestBody ClienteDTO body) {
		// TODO Auto-generated method stub
		return servicio.actualizarCliente(body);
	}

	@Override
	public ResponseEntity<?> eliminarCliente(String identificacion) {
		// TODO Auto-generated method stub
		return servicio.eliminarCliente(identificacion);
	}

	@Override
	public ResponseEntity<?> ingresarCliente(@RequestBody ClienteDTO body) {
		// TODO Auto-generated method stub
		return servicio.ingresarCliente(body);
	}

}
