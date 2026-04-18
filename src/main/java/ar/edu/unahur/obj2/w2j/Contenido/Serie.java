package ar.edu.unahur.obj2.w2j.contenido;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {
    private List<Temporada> temporadas = new ArrayList<>();

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
    public Double calcularCostoLiscencia(){
        return costoBase + temporadas.stream().mapToDouble(t -> t.costoTemporada()).average().orElse(0.0);
    }
}
