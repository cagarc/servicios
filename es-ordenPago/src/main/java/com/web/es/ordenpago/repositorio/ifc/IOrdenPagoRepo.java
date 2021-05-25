/**
 * 
 */
package com.web.es.ordenpago.repositorio.ifc;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.web.es.ordenpago.repositorio.modelo.OrdenPago;

/**
 * @author cgarcia
 *
 */

@Repository
public interface IOrdenPagoRepo extends JpaRepository<OrdenPago, UUID> {


}
