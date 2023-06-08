package dev.acobano.miibmtest.servicio;

import dev.acobano.miibmtest.modelo.Proveedor;
import dev.acobano.miibmtest.repositorio.ProveedorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Clase Java Spring Boot que instancia un componente de servicio que emplea
 * nuestro repositorio para realizar la lógica de negocio de nuestro modelo.
 * @author Álvaro Cobano
 */
@Service
public class ProveedorServiceImpl implements IProveedorService
{
    //ATRIBUTO:
    private ProveedorRepository repositorio;
    
    
    //CONSTRUCTOR CON INYECTOR DE DEPENDENCIAS:
    @Autowired
    public ProveedorServiceImpl(ProveedorRepository repo)
    {
        this.repositorio = repo;
    }
    
    
    //MÉTODO 'GETTER':
    @Override
    public List<Proveedor> getProveedoresMedianteCodigoCliente(Long codCliente)
    {
        return this.repositorio.findByCodigoCliente(codCliente);
    }
}
