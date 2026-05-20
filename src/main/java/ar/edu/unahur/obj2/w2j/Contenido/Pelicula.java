package ar.edu.unahur.obj2.w2j.contenido;

public class Pelicula extends Contenido {
    public Pelicula(String titulo, Double costoBase) {
        super(titulo, costoBase);

    }

    @Override
    public Double doCosto() {
        return 0.0;
    }

}
