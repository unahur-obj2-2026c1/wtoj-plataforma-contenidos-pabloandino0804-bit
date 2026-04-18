package ar.edu.unahur.obj2.w2j.Contenido;

public class Pelicula extends Contenido{
    public Pelicula(String titulo, Double costoBase, String director) {
        super(titulo, costoBase);

    }

    @Override
    public Double calcularCostoLiscencia() {
        return 0.0;
    }

}
