package ar.edu.unahur.obj2.w2j.planes;

import ar.edu.unahur.obj2.w2j.Usuario;

public class PlanPremium implements Plan{
    private Double costoPlan;

    public PlanPremium(Double costoPlan) {
        this.costoPlan = costoPlan;
    }

    @Override
    public Double costoPlan(Usuario usuario) {
        return costoPlan;
    }
}
