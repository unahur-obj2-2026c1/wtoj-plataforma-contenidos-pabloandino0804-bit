package TestsDeContenido.contenidos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.w2j.contenido.Contenido;
import ar.edu.unahur.obj2.w2j.contenido.Documental;
import ar.edu.unahur.obj2.w2j.contenido.Episodio;
import ar.edu.unahur.obj2.w2j.contenido.IDRA;
import ar.edu.unahur.obj2.w2j.contenido.Pelicula;
import ar.edu.unahur.obj2.w2j.contenido.Serie;
import ar.edu.unahur.obj2.w2j.contenido.Temporada;

public class ContenidoTest {
    @Test
    void dadoUnDocumental_seCalculaElCosto() {
        IDRA.getInstance().setValor(5.5);
        Contenido docu = new Documental("docu1", 10.0);
        assertEquals(IDRA.getInstance().getValor(), docu.doCosto()); // 5.5

        assertEquals(10.0, docu.getCostoLiscencia());
        assertEquals(15.5, docu.getCosto()); // 10.0 + 5.5 = 15.5
        
        docu.setCostoBase(13.0);
        assertEquals(18.5, docu.getCosto());
    }

        @Test
    void dadoUnDocumental_seCalculaElCosto2() {
        IDRA.getInstance().setValor(5.5);
        Contenido docu = new Documental("docu1", 10.0);
        assertEquals(IDRA.getInstance().getValor(), docu.doCosto()); // 5.5

        docu.setCostoBase(13.0);
        assertEquals(18.5, docu.getCosto()); // 13.0 + 5.5 = 15.5
    }
        
    

    @Test
    void dadoUnDocumental_SeDevuelveElNombre() {
        IDRA.getInstance().setValor(5.5);
        Contenido docu = new Documental("docu1", 10.0);

        assertEquals(docu.getTitulo(), "docu1");
    }

        @Test
    void dadoUnDocumental_SeDevuelveElNombre2() {
        IDRA.getInstance().setValor(5.5);
        Contenido docu = new Documental("docu1", 10.0);

        docu.setTitulo("articulo");

        assertEquals(docu.getTitulo(), "articulo");
    }


    @Test
    void dadaUnaSerie_alAgregarTemporadas_seCalculaElCostoCorrectamente() {
        Temporada t1 = new Temporada(1);
        t1.agregarEpisodio(new Episodio("t1E1", 1, 20.0));
        t1.agregarEpisodio(new Episodio("t1E2", 2, 30.00));
        t1.agregarEpisodio(new Episodio("t1E3", 3, 40.0));

        Temporada t2 = new Temporada(2);
        t2.agregarEpisodio(new Episodio("t2E1", 1, 30.0));
        t2.agregarEpisodio(new Episodio("t2E2", 2, 40.0));
        t2.agregarEpisodio(new Episodio("t2E3", 3, 50.0));

        Serie serie = new Serie("lost", 10.0);
        serie.agregarTemporada(t1);
        serie.agregarTemporada(t2);

        assertEquals(35.0, serie.doCosto());
        assertEquals(45.0, serie.getCosto()); // 10.0 + 35.0 = 45.0
    }

    @Test
    void dadoUnEpisodio_SeDescribeSuTituloNumeroYCosto() {
        Episodio episodio = new Episodio("prueba", 8, 30.0);
        episodio.cambiarCosto(35.0);

        assertEquals(episodio.costo(), 35.0);
        assertEquals(episodio.getTitulo(), "prueba");
        assertEquals(episodio.getNumero(), 8);
    }

    @Test
    void dadoUnaTemporada_DescribeSuNumero(){
        Temporada t1 = new Temporada(1);

        assertEquals(1, t1.getNumeroTemp());
    }
    
    @Test
    void dadoUnaTemporadaConEpisodios_DevuelvaLaCantDeEpYSuLista() {
        Temporada t1 = new Temporada(1);
        t1.agregarEpisodio(new Episodio("t1E1", 1, 20.0));
        t1.agregarEpisodio(new Episodio("t1E2", 2, 30.00));
        t1.agregarEpisodio(new Episodio("t1E3", 3, 40.0));

        assertEquals(3, t1.cantEpisodios());
        assertEquals(t1.getEpisodios(), t1.getEpisodios());
    }

    @Test
    void dadoUnaTemporadaConEpisodios_DevuelvaSuCostoPromedio() {
        Temporada t1 = new Temporada(1);
        t1.agregarEpisodio(new Episodio("t1E1", 1, 20.0));
        t1.agregarEpisodio(new Episodio("t1E2", 2, 30.00));
        t1.agregarEpisodio(new Episodio("t1E3", 3, 40.0));
        
        assertEquals(30.0, t1.costoPromedio());
    }

    @Test
    void dadoUnaPelicula_SeDevuelveSuCosto() {
        Contenido pelicula = new Pelicula("Avengers", 170000.0);

        assertEquals(pelicula.getCosto(), 170000.0);
    }


}
