/**
 * 
 */
package com.web.articullo.repositorio.ifc;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.web.articullo.repositorio.model.Articulo;


/**
 * @author cgarcia
 *
 */

@Repository
public interface IArticuloRepo extends JpaRepository<Articulo, UUID> {

}
