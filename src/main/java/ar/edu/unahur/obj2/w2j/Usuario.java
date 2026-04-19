package ar.edu.unahur.obj2.w2j;

import java.util.ArrayList;
import java.util.List;


import ar.edu.unahur.obj2.w2j.planes.PlanPremium;
import ar.edu.unahur.obj2.w2j.planes.Plan;

public class Usuario {
    private Plan plan = new PlanPremium(12.0);
    private List<Contenido> contenidos = new ArrayList<>();

    public void verContenido(Contenido contenido) {
        contenidos.add(contenido);
    }

    public Double costoMensual() {
        return plan.costoPlan(this);
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public List<Contenido> getContendios() {
        return new ArrayList<>(contenidos);
    }

    public void limpiarContenidos() {
        contenidos.clear();
    }
}

