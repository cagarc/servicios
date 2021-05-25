/**
 * 
 */
package com.web.es.cliente.controler.ifc;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.web.es.cliente.controler.dto.ClienteDTO;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * @author cgarcia
 *
 */
public interface IClienteControler {

	@GetMapping(value = "/cliente")
	public ResponseEntity<?> consultaCliente();

	@PutMapping(value = "/cliente")
	public ResponseEntity<?> actualizarCliente(@RequestBody(required = false) ClienteDTO body);

	@PostMapping(value = "/cliente")
	public ResponseEntity<?> ingresarCliente(@Valid @RequestBody(required = false) ClienteDTO body);

	@DeleteMapping(value = "/cliente/{identificacion}")
	public ResponseEntity<?> eliminarCliente(@PathVariable String identificacion);

}
