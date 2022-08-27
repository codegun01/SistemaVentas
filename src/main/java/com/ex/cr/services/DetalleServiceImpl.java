
package com.ex.cr.services;

import com.ex.cr.dao.DetalleDao;
import com.ex.cr.domain.Detalle;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DetalleServiceImpl implements DetalleService{
    
    
    
    @Autowired
    private DetalleDao detalleDao;

    @Override
    @Transactional(readOnly = true)
    public List<Detalle> listarDetalle() {
        return (List<Detalle>) detalleDao.findAll();
    }

    @Override
    @Transactional
    public Detalle guardarDetalle(Detalle detalle) {
      return detalleDao.save(detalle);
    }

    @Override
    @Transactional
    public void EliminarDetalle(Detalle detalle) {
        detalleDao.delete(detalle);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Detalle> encontrarDetalle(Long id) {
        return detalleDao.findById(id);
    }
    
}
