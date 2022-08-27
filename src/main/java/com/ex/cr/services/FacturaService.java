
package com.ex.cr.services;

import com.ex.cr.domain.Factura;
import java.util.List;
import java.util.Optional;


public interface FacturaService {
    
    public List<Factura> listarFactura();
    
    public Factura guardarFactura(Factura factura);
    
    public void eliminarFactura(Factura factura);
    
    public Optional<Factura> encontrarFactura(Long id);
}
