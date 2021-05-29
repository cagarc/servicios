/**
 * 
 */
package com.web.es.ordenpago.controler.ifc;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;

import com.web.es.ordenpago.controler.dto.OrdenPagoDTO;


/**
 * @author cgarcia
 *
 */
public interface IOrdenPagoControler {

	@RequestMapping(value = "/ingresoPago", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<?> ingresoPago(@RequestBody List<OrdenPagoDTO> body);

}
