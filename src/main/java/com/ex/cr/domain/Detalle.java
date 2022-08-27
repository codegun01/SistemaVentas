
package com.ex.cr.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "detalle")
public class Detalle implements Serializable{
    
    
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetalle;
    private int Cantidad;
    private double precio;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "factura_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "detalle" })
    private Factura fatura;
    
    

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "producto_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "detalle" })
    private Producto producto;
    
}
