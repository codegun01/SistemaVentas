
package com.ex.cr.services;

import com.ex.cr.dao.ClienteDao;
import com.ex.cr.domain.Cliente;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> listarCliente() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional
    public Cliente guardarCliente(Cliente cliente) {
       return clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void eliminarClente(Cliente cliente) {
       clienteDao.delete(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Cliente> encontrarCliente(Long id) {
        return clienteDao.findById(id);
    }
    
}
