package com.intecap.proyectocolegio.domain.entities;

import com.intecap.proyectocolegio.util.PuntajeEnum;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity(name = "comentario")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ComentarioEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private int id;

    @Column(length = 60)
    private String titulo;

    @Column(length = 255)
    private String contenido;

    @Enumerated(EnumType.STRING)
    private PuntajeEnum puntaje;

    private LocalDate fecha_creacion;

    @OneToMany(mappedBy = "comentario")
    private List<ComentarioCursoEntity> comentarios = new ArrayList<>();

}
