package ar.edu.unahur.obj2.w2j.contenido;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private final Integer numTemp;
    private List<Episodio> episodios = new ArrayList<Episodio>();

    public Temporada(Integer numTemp) {
        this.numTemp = numTemp;
    }

    public void agregarEpisodio(Episodio episodio){
        episodios.add(episodio);
    }

    public Integer getNumeroTemp(){
        return numTemp;
    }

    public List<Episodio> getEpisodios(){
        return episodios;
    }
    
    public Double costoPromedio(){
        return episodios.stream().mapToDouble(e -> e.costo()).average().orElse(0.0);
    }

    public Integer cantEpisodios(){
        return episodios.size();
    }
}
