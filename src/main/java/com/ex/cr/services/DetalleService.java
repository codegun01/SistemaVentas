
package com.ex.cr.services;

import com.ex.cr.domain.Detalle;
import java.util.List;
import java.util.Optional;


public interface DetalleService {
    
    
    public List<Detalle> listarDetalle();
    
    public Detalle guardarDetalle(Detalle detalle);
    
    public void EliminarDetalle (Detalle detalle);
    
    
    public Optional<Detalle> encontrarDetalle(Long id);
}
