package dev.acobano.miibmtest.repositorio;

import dev.acobano.miibmtest.modelo.Proveedor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interfaz Java extendida del repositorio JPA de Spring Boot para poder manejar
 * las operaciones de consulta CRUD en la BBDD.
 * @author Álvaro Cobano
 */
public interface ProveedorRepository extends JpaRepository<Proveedor, Long>
{
    List<Proveedor> findByCodigoCliente(Long codCliente);
}
