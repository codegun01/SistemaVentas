
package com.ex.cr.services;

import com.ex.cr.domain.Cliente;
import java.util.List;
import java.util.Optional;


public interface ClienteService {
    
    public List<Cliente> listarCliente();
    
    public Cliente guardarCliente(Cliente cliente);
    
    public void eliminarClente(Cliente cliente);
    
    public Optional<Cliente> encontrarCliente(Long id);
}
