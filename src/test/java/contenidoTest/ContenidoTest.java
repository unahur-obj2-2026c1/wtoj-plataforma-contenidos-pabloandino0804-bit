package contenidoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.w2j.contenido.Contenido;
import ar.edu.unahur.obj2.w2j.contenido.Documental;
import ar.edu.unahur.obj2.w2j.contenido.Episodio;
import ar.edu.unahur.obj2.w2j.contenido.Serie;
import ar.edu.unahur.obj2.w2j.contenido.Temporada;

public class ContenidoTest {
     @Test
    void dadoUnDocumental_seCalculaElCosto() {
        Contenido docu = new Documental("docu1", 10.0);
        assertEquals(10.5, docu.getCostoLiscencia());

    }

    @Test
    void dadaUnaSerie_alAgregarTemporadas_seCalculaElCostoCorrectamente() {
        Temporada t1 = new Temporada(1,
                Arrays.asList(
                        new Episodio("t1E1", 1, 20.0),
                        new Episodio("t1E2", 2, 30.00),
                        new Episodio("t1E3", 3, 40.0)));

        Temporada t2 = new Temporada(2,
                Arrays.asList(
                        new Episodio("t2E1", 1, 30.0),
                        new Episodio("t2E2", 2, 40.0),
                        new Episodio("t2E3", 3, 50.0)));

        Contenido serie = new Serie("lost", 10.0,
                Arrays.asList(t1, t2));

        assertEquals(45.0, serie.getCostoLiscencia());

    }
}
