package ar.edu.unahur.obj2.w2j.contenido;

public class Pelicula extends Contenido{
    public Pelicula(String titulo, Double costoBase, String director) {
        super(titulo, costoBase);

    }

    @Override
    public Double getCostoLiscencia() {
        return 0.0;
    }

}
