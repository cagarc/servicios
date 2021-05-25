/**
 * 
 */
package com.web.es.ordenpago.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import com.web.es.ordenpago.controler.dto.OrdenPagoDTO;
import com.web.es.ordenpago.repositorio.modelo.OrdenPago;

/**
 * @author cgarcia
 *
 */
public class OrdenPagoConvert {

	public static final OrdenPagoDTO modelToType(OrdenPago ordenPago) {
		return new ModelMapper().map(ordenPago, OrdenPagoDTO.class);
	}
	
	public final static OrdenPago modelToType(OrdenPagoDTO ordenPago) {
		return new ModelMapper().map(ordenPago, OrdenPago.class);
	}

	public static final List<OrdenPagoDTO> listModelToDTO(List<OrdenPago> odenPagos) {
		return odenPagos.stream().map(orden -> modelToType(orden)).collect(Collectors.toList());
	}
	
	public static final List<OrdenPago> listModelTo(List<OrdenPagoDTO> odenPagos) {
		return odenPagos.stream().map(orden -> modelToType(orden)).collect(Collectors.toList());
	}

}
