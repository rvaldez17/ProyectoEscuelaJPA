package com.intecap.proyectocolegio.domain.entities;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class InscripcionId implements Serializable {

    private int estudiante_id;

    private int curso_id;
}
