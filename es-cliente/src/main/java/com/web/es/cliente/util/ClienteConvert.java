/**
 * 
 */
package com.web.es.cliente.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import com.web.es.cliente.controler.dto.ClienteDTO;
import com.web.es.cliente.repositorio.model.Cliente;

/**
 * @author cgarcia
 *
 */
public class ClienteConvert {

	public static final ClienteDTO modelToType(Cliente cliente) {
		return new ModelMapper().map(cliente, ClienteDTO.class);
	}

	public final static Cliente modelToType(ClienteDTO cliente) {
		return new ModelMapper().map(cliente, Cliente.class);
	}

	public static final List<ClienteDTO> listModelToDTO(List<Cliente> clientes) {
		return clientes.stream().map(cliente -> modelToType(cliente)).collect(Collectors.toList());
	}

	public static final List<Cliente> listModelTo(List<ClienteDTO> clientes) {
		return clientes.stream().map(cliente -> modelToType(cliente)).collect(Collectors.toList());
	}
}
