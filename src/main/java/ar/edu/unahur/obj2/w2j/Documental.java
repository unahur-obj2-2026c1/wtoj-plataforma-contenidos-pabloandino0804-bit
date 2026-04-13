package ar.edu.unahur.obj2.w2j;

public class Documental{
    private Contenido costoBase;
    private IDRA canonIDRA;
    public Double calcularCostoBase() {
        return costoBase + canonIDRA;
    }
}