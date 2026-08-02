package TestsDeContenido.usuarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.w2j.contenido.Pelicula;
import ar.edu.unahur.obj2.w2j.planes.Plan;
import ar.edu.unahur.obj2.w2j.planes.PlanBasico;
import ar.edu.unahur.obj2.w2j.planes.PlanFamiliar;
import ar.edu.unahur.obj2.w2j.planes.PlanPremium;
import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

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

        PlanFamiliar familiar = new PlanFamiliar(2);

        usuario.setPlan(familiar);

        assertEquals(usuario.costoMensual(), 4.25);
        assertEquals(usuario.getPlan(), familiar);
        assertEquals(familiar.getDescuento(), 0.15);
    }

    @Test
    void dadoUnUsuario_cuandoElUsuarioCambiaDePlanBasicoAPremium_ElPlanActualSeraFamiliar() {
        Usuario usuario = new Usuario(new PlanBasico(2));

        Plan premium = new PlanPremium(50.0);

        usuario.setPlan(premium);

        assertEquals(usuario.costoMensual(), 50.0);
        assertEquals(usuario.getPlan(), premium);
    }

}
