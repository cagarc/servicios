/**
 * 
 */
package com.web.es.cliente.controler.ifc;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.web.es.cliente.controler.dto.ClienteDTO;



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
	ResponseEntity<?> ingresarCliente( @RequestBody ClienteDTO body);

	@DeleteMapping(value = "/cliente/{identificacion}")
	public ResponseEntity<?> eliminarCliente(@PathVariable String identificacion);

}
