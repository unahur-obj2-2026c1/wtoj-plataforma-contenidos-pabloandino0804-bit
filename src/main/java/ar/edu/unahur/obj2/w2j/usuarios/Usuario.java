package ar.edu.unahur.obj2.w2j.usuarios;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.w2j.contenido.Contenido;
import ar.edu.unahur.obj2.w2j.planes.Plan;

public class Usuario {
    private Plan plan;
    private List<Contenido> contenidos = new ArrayList<>();

    public Usuario(Plan plan) {
        this.plan = plan;
    }

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
        return this.contenidos;
    }

    public void limpiarContenidos() {
        contenidos.clear();
    }
}
