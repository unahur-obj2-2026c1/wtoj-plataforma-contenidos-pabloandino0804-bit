package ar.edu.unahur.obj2.w2j.contenido;

public class Documental extends Contenido{
    public Documental(String titulo, Double costoBase) {
        super(titulo, costoBase);

    }

    @Override
    public Double doCosto() {
        return IDRA.mostrarInstance().mostrarValor();
    }

}