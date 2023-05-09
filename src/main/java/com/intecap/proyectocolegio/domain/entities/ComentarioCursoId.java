package com.intecap.proyectocolegio.domain.entities;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ComentarioCursoId implements Serializable {

    private int comentario_id;

    private int curso_id;
}
