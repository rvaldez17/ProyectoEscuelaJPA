package com.intecap.proyectocolegio.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity(name = "categoria")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CategoriaEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private int id;

    @Column(length = 120)
    private String nombre;

    private LocalDate fecha_creacion;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "categoria"
    )
    private Set<CursoEntity> cursos;



}
