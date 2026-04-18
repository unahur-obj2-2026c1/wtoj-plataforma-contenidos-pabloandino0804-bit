package ar.edu.unahur.obj2.w2j;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private final Integer numTemp;
    private List<Episodio> episodios = new ArrayList<Episodio>();

    public Temporada(Integer numTemp) {
        this.numTemp = numTemp;
    }

    public Temporada(Integer numTemp, List<Episodio> episodios){
        this.numTemp = numTemp;
        this.episodios = episodios;
    }

    public void agregarEpisodio(Episodio episodio){
        episodios.add(episodio);
    }

    public Integer numeroTemp(){
        return numTemp;
    }

    public Double costoTemporada(){
        return episodios.stream().mapToDouble(e -> e.getCosto()).average().orElse(0.0);
    }
}
