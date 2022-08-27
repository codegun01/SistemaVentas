
package com.ex.cr.services;

import com.ex.cr.dao.FacturaDao;
import com.ex.cr.domain.Factura;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FacturaServiceImpl implements FacturaService{

    @Autowired
    private FacturaDao facturaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Factura> listarFactura() {
        return (List<Factura>) facturaDao.findAll();
    }

    @Override
    @Transactional
    public Factura guardarFactura(Factura factura) {
        return facturaDao.save(factura);
    }

    @Override
    @Transactional
    public void eliminarFactura(Factura factura) {
        facturaDao.delete(factura);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Factura> encontrarFactura(Long id) {
        return facturaDao.findById(id);
    }
    
}
