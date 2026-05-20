package ar.edu.unahur.obj2.w2j.planes;

import java.util.List;

import ar.edu.unahur.obj2.w2j.Usuario;
import ar.edu.unahur.obj2.w2j.contenido.Contenido;

public class PlanBasico implements Plan {
    private Integer limite;
    private static Double costoBase = 5.0;

    public PlanBasico(Integer limite) {
        this.limite = limite;
    }

    @Override
    public Double costoPlan(Usuario usuario) {
        List<Contenido> contenidos = usuario.getContendios();
        Double costoExcedentes = contenidos.stream().skip(limite).mapToDouble(c -> c.getCostoLiscencia()).sum();
        return ajusteTotal(costoBase + costoExcedentes);
    }

    public static Double getCostoBase() {
        return costoBase;
    }

    public static void setCostoBase(Double costoNuevo) {
        costoBase = costoNuevo;
    }
    
    protected Double ajusteTotal(Double total) {
        return total;
    }

    @Override
    public void actualizarCostoPlan(Double nuevoValor) {
        costoBase = nuevoValor;
    }
}
