/**
 * 
 */
package com.web.es.ordenpago.controler.ifc;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import com.web.es.ordenpago.controler.dto.OrdenPagoDTO;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * @author cgarcia
 *
 */
public interface IOrdenPagoControler {

	@RequestMapping(value = "/ingresoPago", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<?> ingresoPago(@RequestBody List<OrdenPagoDTO> body);

}
