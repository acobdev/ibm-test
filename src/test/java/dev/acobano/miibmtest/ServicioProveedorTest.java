package dev.acobano.miibmtest;

import dev.acobano.miibmtest.modelo.Proveedor;
import dev.acobano.miibmtest.servicio.ProveedorServiceImpl;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Clase de testing JUnit encargada de verificar que las operaciones de lógica
 * de negocio llevadas a cabo por nuestro servicio funcionan adecuadamente.
 * @author Álvaro Cobano
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ServicioProveedorTest 
{   
    //ATRIBUTO:
    private ProveedorServiceImpl servicio;
    
    //MÉTODOS DE TESTEO:
    @Test
    public void getProveedoresPorCodigoClienteExistenteTest()
    {
        Long codCliente = 5L;
        List<Proveedor> listaProveedores = servicio.getProveedoresMedianteCodigoCliente(codCliente);
        
        assertNotNull(listaProveedores);
        assertFalse(listaProveedores.isEmpty());
        assertEquals(2, listaProveedores.size());
        assertEquals("Coca-Cola", listaProveedores.get(0).getNombre());
        assertEquals("Pepsi", listaProveedores.get(1).getNombre());
    }
    
    @Test
    public void getProveedoresPorCodigoClienteInexistenteTest() throws Exception
    {
        Long codCliente = 9L;
        List<Proveedor> listaProveedores = servicio.getProveedoresMedianteCodigoCliente(codCliente);
        
        assertNotNull(listaProveedores);
        assertTrue(listaProveedores.isEmpty());
    }
}
