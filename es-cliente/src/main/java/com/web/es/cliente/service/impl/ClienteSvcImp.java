/**
 * 
 */
package com.web.es.cliente.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.web.es.cliente.controler.dto.ClienteDTO;
import com.web.es.cliente.repositorio.ifc.IClienteRepo;
import com.web.es.cliente.repositorio.model.Cliente;
import com.web.es.cliente.service.ifc.IClienteSvc;
import com.web.es.cliente.util.ClienteConvert;

/**
 * @author cgarcia
 *
 */

@Service
public class ClienteSvcImp implements IClienteSvc {

	@Autowired
	IClienteRepo repo;

	@Override
	public ResponseEntity<?> consultaCliente() {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(ClienteConvert.listModelToDTO(repo.findAll()), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> actualizarCliente(ClienteDTO body) {
		// TODO Auto-generated method stub
		Cliente respo =ClienteConvert.modelToType(body);
		return new ResponseEntity<>(ClienteConvert.modelToType(repo.save(respo)), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> ingresarCliente(ClienteDTO body) {
		// TODO Auto-generated method stub
		Cliente respo =ClienteConvert.modelToType(body);
		return new ResponseEntity<>(ClienteConvert.modelToType(repo.save(respo)), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> eliminarCliente(String identificacion) {
		// TODO Auto-generated method stub
		Cliente cliente =repo.findOne(identificacion);
		repo.delete(cliente);
		return null;
	}

}
