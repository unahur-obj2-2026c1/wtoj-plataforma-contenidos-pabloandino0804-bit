package ar.edu.unahur.obj2.w2j.planes;

import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

public interface Plan {
    Double costoPlan(Usuario usuario);

    void actualizarCostoPlan(Double nuevoValor);
}
