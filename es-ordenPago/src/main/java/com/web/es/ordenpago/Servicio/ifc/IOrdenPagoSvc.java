/**
 * 
 */
package com.web.es.ordenpago.Servicio.ifc;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.web.es.ordenpago.controler.dto.OrdenPagoDTO;

/**
 * @author cgarcia
 *
 */
public interface IOrdenPagoSvc {

	public ResponseEntity<?> ingresoPago(List<OrdenPagoDTO> body);
}
