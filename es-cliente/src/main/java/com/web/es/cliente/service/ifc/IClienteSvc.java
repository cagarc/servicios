/**
 * 
 */
package com.web.es.cliente.service.ifc;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.web.es.cliente.controler.dto.ClienteDTO;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * @author cgarcia
 *
 */
public interface IClienteSvc {
	
	public ResponseEntity<?> consultaCliente ();
	
	public ResponseEntity<?> actualizarCliente( ClienteDTO body);
	
	public ResponseEntity<?> ingresarCliente( ClienteDTO body);
	
	public ResponseEntity<?> eliminarCliente(String identificacion);

}
