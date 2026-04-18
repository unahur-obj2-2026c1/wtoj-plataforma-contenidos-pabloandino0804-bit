package ar.edu.unahur.obj2.w2j.Contenido;

public class IDRA {
    private static IDRA instance = new IDRA();
    private Double IDRAvalor = 0.5;

    private IDRA() {
    }

    public static IDRA mostrarInstance() {
        return instance;
    }

    public Double mostrarValor(){
        return IDRAvalor;
    }
}
