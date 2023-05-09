package com.intecap.proyectocolegio.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity(name = "comentarioCurso")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ComentarioCursoEntity implements Serializable {

    @EmbeddedId
    private ComentarioCursoId id;

    @ManyToOne
    @JoinColumn(name = "curso_id", insertable = false, updatable = false)
    private CursoEntity curso;

    @ManyToOne
    @JoinColumn(name = "comentario_id", insertable = false, updatable = false)
    private ComentarioEntity comentario;


}
