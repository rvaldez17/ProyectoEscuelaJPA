package com.intecap.proyectocolegio.domain.entities;


import com.intecap.proyectocolegio.util.CertificadoEnum;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity(name = "curso")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CursoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 60)
    private String titulo;

    @Column(length = 100)
    private String subtitulo;

    @Column(length = 255)
    private String descripcion;

    @Column(length = 255)
    private String imagen;

    @Column(length = 255)
    private String video;

    private float  duracionVideo;

    private float  cantidad_recursos;

    private BigDecimal precio;

    @Enumerated(EnumType.STRING)
    private CertificadoEnum certificado_finalizado;

    private LocalDate fecha_creacion;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaEntity categoria;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private InstructorEntity instructor;

    @OneToOne
    @JoinColumn(name = "nivel_id", unique = true)
    private NivelEntity nivel;

    @OneToMany(mappedBy = "curso")
    private List<InscripcionEntity> inscripciones = new ArrayList<>();

}
