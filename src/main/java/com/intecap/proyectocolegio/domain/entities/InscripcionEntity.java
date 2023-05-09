package com.intecap.proyectocolegio.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name = "inscripcion")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InscripcionEntity implements Serializable {

    @EmbeddedId
    private InscripcionId id;

    private BigDecimal precio_pagado;

    private LocalDate fecha_creacion;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", insertable=false, updatable=false)
    private EstudianteEntity estudiante;

    @ManyToOne
    @JoinColumn(name = "curso_id", insertable=false, updatable=false)
    private CursoEntity curso;

}
