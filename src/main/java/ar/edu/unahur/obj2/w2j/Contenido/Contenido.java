package ar.edu.unahur.obj2.w2j.contenido;

public abstract class Contenido{
    protected String titulo;
    protected Double costoBase;

    public Contenido(String titulo, Double costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getCostoLiscencia(){
        return costoBase;
    }
    public void setCostoBase(Double costoBase) {
        this.costoBase = costoBase;
    }

    public Double costo() {
        return costoBase + this.doCosto();
    }

    public abstract Double doCosto();
}

