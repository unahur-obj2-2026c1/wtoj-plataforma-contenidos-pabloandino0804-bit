package TestsDeContenido.usuarios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.w2j.Usuario;
import ar.edu.unahur.obj2.w2j.contenido.Pelicula;
import ar.edu.unahur.obj2.w2j.planes.PlanBasico;
import ar.edu.unahur.obj2.w2j.planes.PlanFamiliar;

public class UsuarioTest {

    @Test
    void dadoUsuarioConContenidos_cuandoLimpiaConsumo_entoncesQuedaSinContenidos() {
        Usuario usuario = new Usuario(new PlanBasico(2));

        usuario.verContenido(new Pelicula("P1", 2.0));

        usuario.limpiarContenidos();

        assertEquals(0, usuario.getContendios().size());
    }

    @Test
    void dadoUnUsuario_cuandoElUsuarioCambiaDePlanBasicoAFamiliar_ElPlanActualSeraFamiliar() {
        Usuario usuario = new Usuario(new PlanBasico(2));

        usuario.setPlan(new PlanFamiliar(2));

        assertEquals(usuario.costoMensual(), 4.25);
        assertEquals(usuario.getPlan(), usuario.getPlan());
    }

    @Test
    void testName2() {
        assertTrue(true);
    }
    
}
