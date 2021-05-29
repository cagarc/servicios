/**
 * 
 */
package com.web.es.cliente.repositorio.ifc;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.web.es.cliente.repositorio.model.Cliente;

/**
 * @author cgarcia
 *
 */

@Repository
public interface IClienteRepo extends JpaRepository<Cliente, UUID> {

	@Query(value = "select * from cliente t where t.identificacion = :identificacion limit 1", nativeQuery = true)
	Cliente findOne(String identificacion);

}
