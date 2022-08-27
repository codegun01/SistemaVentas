
package com.ex.cr.services;

import com.ex.cr.dao.ProductoDao;
import com.ex.cr.domain.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoDao productoDao;
    
    @Override
    public List<Producto> listarProducto() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoDao.save(producto);
    }

    @Override
    public void eliminarProducto(Producto producto) {
       productoDao.delete(producto);
    }

    @Override
    public Optional<Producto> econtrarProducto(Long id) {
       return productoDao.findById(id);
    }
    
}
