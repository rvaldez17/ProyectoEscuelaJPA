package com.intecap.proyectocolegio.domain.entities;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity(name = "instructor")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InstructorEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private int id;

    @Column(length = 120)
    private String nombre;

    @Column(length = 120)
    private String apellido;

    @Column(length = 11)
    private int identificacion;

    @Column(length = 120)
    private String ciudad;

    @Column(length = 120)
    private String pais;

    @Column(length = 255)
    private String direccion;

    @Column(length = 11)
    private int telefono;

    @Column(length = 100)
    private String correo;

    private LocalDate fecha_creacion;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "instructor"
    )
    private Set<CursoEntity> cursos;

}
