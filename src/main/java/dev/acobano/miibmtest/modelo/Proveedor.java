package dev.acobano.miibmtest.modelo;

/**
 * Clase Java JPA que representará las tuplas de la tabla de proveedores en
 * nuestra base de datos.
 * @author Álvaro Cobano
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.GregorianCalendar;

@Entity
public class Proveedor 
{
    //ATRIBUTOS:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProveedor;
    private String nombre;
    private GregorianCalendar fechaAlta;
    private Long idCliente;
    
    
    //CONSTRUCTOR:
    public Proveedor() {}
    
    
    //MÉTODOS 'GETTERS':
    public Long getId()
    {
        return this.idProveedor;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public GregorianCalendar getFechaAlta()
    {
        return this.fechaAlta;
    }
    
    public Long getCodigoCliente()
    {
        return this.idCliente;
    }
    
    
    //MÉTODOS 'SETTERS'
    public void setNombre(String nuevoNombre)
    {
        this.nombre = nuevoNombre;
    }
    
    public void setFechaAlta(GregorianCalendar nuevaFecha)
    {
        this.fechaAlta = nuevaFecha;
    }
    
    public void setCodigoCliente(Long nuevoCod)
    {
        this.idCliente = nuevoCod;
    }
}
