package dev.acobano.miibmtest.controlador;

import dev.acobano.miibmtest.modelo.Proveedor;
import dev.acobano.miibmtest.servicio.ProveedorServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Clase Java que actuará como controlador Spring Boot para manejar las llamadas
 * HTTP y así poder realizar la consulta deseada mediante la mediación de nuestro
 * servicio API REST.
 * @author Álvaro Cobano
 */
@RestController
@RequestMapping("/proveedores")
public class ProveedorController 
{
    //ATRIBUTO:
    private ProveedorServiceImpl servicio;
    
    
    //CONSTRUCTOR CON INYECCIÓN DE DEPENDENCIAS:
    @Autowired
    public ProveedorController(ProveedorServiceImpl ps)
    {
        this.servicio = ps;
    }
    
    
    //MÉTODO PARA LA LLAMADA 'GET' AL MICROSERVICIO API REST:
    public List<Proveedor> getProveedoresMedianteCodigoCliente(@PathVariable Long codCliente)
    {
        return this.servicio.getProveedoresMedianteCodigoCliente(codCliente);
    }
}
