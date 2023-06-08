package dev.acobano.miibmtest.servicio;

import dev.acobano.miibmtest.modelo.Proveedor;
import java.util.List;

/**
 * Interfaz Java Spring Boot que define los métodos que deben ser implementados
 * en el servicio para realizar las operaciones deseadas con el modelo.
 * @author Álvaro Cobano
 */
public interface IProveedorService 
{
    public List<Proveedor> getProveedoresMedianteCodigoCliente(Long codCliente);
}
