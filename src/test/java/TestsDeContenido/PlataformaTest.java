package TestsDeContenido;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.w2j.Plataforma;
import ar.edu.unahur.obj2.w2j.Usuario;
import ar.edu.unahur.obj2.w2j.contenido.Pelicula;
import ar.edu.unahur.obj2.w2j.planes.Plan;
import ar.edu.unahur.obj2.w2j.planes.PlanBasico;
import ar.edu.unahur.obj2.w2j.planes.PlanFamiliar;
import ar.edu.unahur.obj2.w2j.planes.PlanPremium;

public class PlataformaTest {
    private Double costoOriginal;

    @BeforeEach
    void setUp() {
        costoOriginal = PlanBasico.getCostoBase();
    }

    @AfterEach
    void tearDown() {
        PlanBasico.setCostoBase(costoOriginal);
    }

    @Test
    void dadoUnaPlataforma_CuandoLeConsultaSuFacturacion_DevuelveElValorSumadoDelCostoPlanDeTodosLosUsuarios() {
        Plataforma plataforma = Plataforma.getInstance();

        Usuario u1 = new Usuario(new PlanPremium(10.0));
        Usuario u2 = new Usuario(new PlanPremium(20.0));

        plataforma.agregarUsuario(u1);
        plataforma.agregarUsuario(u2);

        assertEquals(plataforma.facturacionMensual(), 30.0);
    }

    @Test
    void dadoUnaPlataforma_CuandoLimpiaContenidos_LaCantDeContenidosDeTodosLosUsuariosEs0() {
        Plataforma plataforma = Plataforma.getInstance();

        Usuario u1 = new Usuario(new PlanPremium(10.0));
        Usuario u2 = new Usuario(new PlanPremium(20.0));
        u1.verContenido(new Pelicula("Avengers", 170000.0));
        u2.verContenido(new Pelicula("Avengers", 170000.0));

        plataforma.agregarUsuario(u1);
        plataforma.agregarUsuario(u2);

        plataforma.limpiarContenidos();
        
        assertEquals(0, u1.getContendios().size());
        assertEquals(0, u2.getContendios().size());
    }

    @Test
    void dadoUnaPlataforma_ActualizaaLosPlanes_AUnNuevoValor() {
        Plataforma plataforma = Plataforma.getInstance();
        Plan planFamiliar = new PlanFamiliar(10);
        Plan planBasico = new PlanBasico(10);

        Usuario usuarioBasico = new Usuario(planBasico);


        plataforma.actualizarCostoPlan(planBasico, 11.6);
        plataforma.actualizarCostoPlan(planFamiliar, 8.3);
        assertEquals(planBasico.costoPlan(usuarioBasico), 8.3);
    }
}
