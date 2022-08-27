
package com.ex.cr.dao;

import com.ex.cr.domain.Factura;
import org.springframework.data.repository.CrudRepository;


public interface FacturaDao extends CrudRepository<Factura, Long>{
    
}
