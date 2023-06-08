package dev.acobano.miibmtest;

import dev.acobano.miibmtest.controlador.ProveedorController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Clase de testing JUnit encargada de verificar que el controlador definido en
 * el proyecto resuelva correctamente las solicitudes HTTP y devuelva las
 * respuestas esperadas.
 * @author Álvaro Cobano
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@WebMvcTest(ProveedorController.class)
@AutoConfigureMockMvc
public class IntegracionControladorProveedorTest 
{
    //ATRIBUTO SPRING PARA REALIZAR SOLICITUDES HTTP SIMULADAS:
    @Autowired
    private MockMvc mock;
    
    //MÉTODOS DE TESTEO:
    @Test
    public void getProveedoresPorCodigoClienteExistenteTest() throws Exception
    {
        Long codCliente = 5L;
        
        mock.perform(MockMvcRequestBuilders
            .get("http://localhost:8080/proveedores/{codCliente}", codCliente))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.jsonPath("$").isArray())
            .andExpect(MockMvcResultMatchers.jsonPath("$[0].nombre").value("Coca-Cola"))
            .andExpect(MockMvcResultMatchers.jsonPath("$[1].nombre").value("Pepsi"));
    }
    
    @Test
    public void getProveedoresPorCodigoClienteInexistenteTest() throws Exception
    {
        Long codCliente = 9L;
        
        mock.perform(MockMvcRequestBuilders
            .get("http://localhost:8080/proveedores/{codCliente}", codCliente))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.jsonPath("$").isArray())
            .andExpect(MockMvcResultMatchers.jsonPath("$").isEmpty());
    }
}
