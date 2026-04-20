package ar.edu.unahur.obj2.w2j.contenido;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {
    private List<Temporada> temporadas = new ArrayList<Temporada>();

    public Serie(String titulo, Double costoBase){
        super(titulo, costoBase);
    }

    public Serie(String titulo, Double costoBase, List<Temporada> temporadas) {
        super(titulo, costoBase);
        this.temporadas = temporadas;
    }

    public void agregarTemporada(Temporada temporada){
        temporadas.add(temporada);
    }

    @Override
    public Double getCostoLiscencia(){
        Integer cantEpisodios = temporadas.stream().mapToInt(t -> t.cantEpisodios()).sum();
        Double costoTotal = temporadas.stream().mapToDouble(t -> t.costoTotal()).sum();
        return costoBase + (cantEpisodios / costoTotal);
    }
}
