package dev.acobano.miibmtest;

import dev.acobano.miibmtest.modelo.Proveedor;
import dev.acobano.miibmtest.repositorio.ProveedorRepository;
import java.util.GregorianCalendar;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Clase de testing JUnit encargada de probar el repositorio de la aplicación,
 * asegurando que las operaciones de acceso a la BBDD funcione correctamente.
 * @author Álvaro Cobano
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class RepositorioProveedorTest 
{
    //ATRIBUTOS:
    @Autowired
    private TestEntityManager entityManager;
    
    @Autowired
    private ProveedorRepository repositorio;
    
    
    //MÉTODO DE TESTEO:
    @Test
    public void findByCodigoClienteTest()
    {
        //Creamos en primer lugar los datos de prueba:
        Proveedor p1 = new Proveedor();
        p1.setNombre("Proveedor 1");
        p1.setFechaAlta(new GregorianCalendar(2015, 2, 15));
        p1.setCodigoCliente(1L);
        entityManager.persist(p1);
        
        Proveedor p2 = new Proveedor();
        p2.setNombre("Proveedor 2");
        p2.setFechaAlta(new GregorianCalendar(2002, 3, 4));
        p2.setCodigoCliente(2L);
        entityManager.persist(p2);
        
        Proveedor p3 = new Proveedor();
        p3.setNombre("Proveedor 3");
        p3.setFechaAlta(new GregorianCalendar(2020, 10, 22));
        p3.setCodigoCliente(1L);
        entityManager.persist(p3);
        
        entityManager.flush();
        
        //Ejecutamos la consulta:
        List<Proveedor> listaProveedores = repositorio.findByCodigoCliente(1L);
        
        //Empleamos las assertions:
        assertEquals(2, listaProveedores.size());        
        assertEquals("Proveedor 1", listaProveedores.get(0).getNombre());
        assertEquals("Proveedor 3", listaProveedores.get(1).getNombre());
    }
}
