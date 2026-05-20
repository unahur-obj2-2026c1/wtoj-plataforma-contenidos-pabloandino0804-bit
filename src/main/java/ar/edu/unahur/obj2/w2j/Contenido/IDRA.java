package ar.edu.unahur.obj2.w2j.contenido;

public class IDRA {
    private static IDRA instance = new IDRA();
    private Double IDRAvalor = 0.5;


    public static IDRA getInstance() {
        return instance;
    }

    public Double getValor() {
        return IDRAvalor;
    }

    public void setValor(Double valor) {
        this.IDRAvalor = valor;
    }
}
