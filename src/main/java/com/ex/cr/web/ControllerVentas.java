package com.ex.cr.web;

import com.ex.cr.domain.Cliente;
import com.ex.cr.domain.Detalle;
import com.ex.cr.domain.Factura;
import com.ex.cr.domain.Producto;
import com.ex.cr.services.ClienteService;
import com.ex.cr.services.DetalleService;
import com.ex.cr.services.FacturaService;
import com.ex.cr.services.ProductoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerVentas {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private FacturaService facturaService;

    @Autowired
    private DetalleService detalleService;
    
    @Autowired
    private ProductoService productoService;

    @GetMapping("/cliente")
    public List<Cliente> listarCliente() {
        return clienteService.listarCliente();
    }

    @PostMapping("/cliente")
    public Cliente guardarCliente(@RequestBody Cliente cliente) {
        return clienteService.guardarCliente(cliente);
    }

    @PutMapping("/cliente")
    public Cliente editarProducto(@RequestBody Cliente cliente) {
        Cliente cliente1 = null;

        if (cliente.getIdCliente() == null) {
            return new Cliente();
        }

        Optional<Cliente> clienteSV = clienteService.encontrarCliente(cliente.getIdCliente());

        if (clienteSV.get().getIdCliente() != null) {
            cliente1 = clienteService.guardarCliente(cliente);
        }

        return cliente1;
    }

    @DeleteMapping("/cliente")
    public void eliminarCliente(@RequestBody Cliente cliente) {
        clienteService.eliminarClente(cliente);
    }

    //********
    //********
    //********METODOS FACTURA********
    //********
    //********
    @GetMapping("/factura")
    public List<Factura> listarFactura() {
        return facturaService.listarFactura();
    }

    @PostMapping("/factura")
    public Factura guardarCliente(@RequestBody Factura factura) {
        return facturaService.guardarFactura(factura);
    }

    @PutMapping("/factura")
    public Factura editarProducto(@RequestBody Factura factura) {
        Factura factura1 = null;

        if (factura.getIdFactura() == null) {
            return new Factura();
        }

        Optional<Factura> facturaSV = facturaService.encontrarFactura(factura.getIdFactura());

        if (facturaSV.get().getIdFactura() != null) {
            factura1 = facturaService.guardarFactura(factura);
        }

        return factura1;
    }
    //******************************************
    //******************************************
    //Metodo personalisado buscar factura por Id.
    //******************************************
    //******************************************
    @GetMapping("/factura/{id}")
    public Optional<Factura> encontrarFactura(@PathVariable Long id){
        return facturaService.encontrarFactura(id);
    }
    //******************************************
    //******************************************
    //******************************************

    @DeleteMapping("/factura")
    public void eliminarFactura(@RequestBody Factura factura) {
        facturaService.eliminarFactura(factura);
    }

    //********
    //********
    //********METODOS DETALLE********
    //********
    //********
    @GetMapping("/detalle")
    public List<Detalle> listarDetalle() {
        return detalleService.listarDetalle();
    }

    @PostMapping("/detalle")
    public Detalle crearDetalle(@RequestBody Detalle detalle) {
        return detalleService.guardarDetalle(detalle);
    }
    
    
    @PutMapping("/detalle")
    public Detalle editarDetalle(@RequestBody Detalle detalle) {
            Detalle detalle1 = null;

        if (detalle.getIdDetalle() == null) {
            return new Detalle();
        }

        Optional<Detalle> detalleSV = detalleService.encontrarDetalle(detalle.getIdDetalle());

        if (detalleSV.get().getIdDetalle() != null) {
            detalle1 = detalleService.guardarDetalle(detalle);
        }
        return detalle1;
    }
    
    @DeleteMapping("/detalle")
    public void eliminarDetalle(@RequestBody Detalle detalle){
        detalleService.EliminarDetalle(detalle);
    }
    
    
    //********
    //********
    //********METODOS PRODCUTO********//
    //********
    //********
    
    @GetMapping("/producto")
    public List<Producto> listarProducto(){
        return productoService.listarProducto();
    }
    
    @PostMapping("/producto")
    public Producto crearProducto(@RequestBody Producto producto){
        return productoService.guardarProducto(producto);
    }
    
    
    @PutMapping("/producto")
    public Producto editarProducto (@RequestBody Producto producto){
        Producto producto1 = null;
        
        if(producto.getIdProducto() == null){
            return new Producto();
        }
        
        Optional<Producto> productoSV = productoService.econtrarProducto(producto.getIdProducto());
        
        
        if(productoSV.get().getIdProducto() != null){
            producto1 = productoService.guardarProducto(producto);
        }
        
        return producto1;
        
    }
    
    
    @DeleteMapping("/producto")
    public void eliminarProducto (@RequestBody Producto producto){
        productoService.eliminarProducto(producto);
    }
     
    
    
    
    
    

}
