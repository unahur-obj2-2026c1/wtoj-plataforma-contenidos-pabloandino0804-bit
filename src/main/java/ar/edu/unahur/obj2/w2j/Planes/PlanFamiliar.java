package ar.edu.unahur.obj2.w2j.planes;

public class PlanFamiliar extends PlanBasico {
    private Double descuento = 0.15;

    public PlanFamiliar(Integer limite) {
        super(limite);
    }

    @Override
    protected Double ajusteTotal(Double total) {
        return total * (1 - descuento);
    }

    public Double getDescuento(){
        return descuento;
    }
}
