package ar.edu.unahur.obj2.w2j.Contenido;

public class Documental extends Contenido{
    public Documental(String titulo, Double costoBase) {
        super(titulo, costoBase);

    }

    @Override
    public Double calcularCostoLiscencia() {
        return IDRA.mostrarInstance().mostrarValor();
    }

}