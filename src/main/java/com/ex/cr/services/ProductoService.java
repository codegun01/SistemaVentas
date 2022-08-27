
package com.ex.cr.services;

import com.ex.cr.domain.Producto;
import java.util.List;
import java.util.Optional;


public interface ProductoService {
    
    public List<Producto> listarProducto();
    
    
    public Producto guardarProducto(Producto producto);
    
    
    public void eliminarProducto(Producto producto);
    
    
    public Optional<Producto> econtrarProducto(Long id);
    
}
