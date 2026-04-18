package ar.edu.unahur.obj2.w2j.contenido;

public class Contenido{
    protected String titulo;
    protected Double costoBase;

    public Contenido(String titulo, Double costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getCostoLiscencia(){
        return costoBase;
    }
}

