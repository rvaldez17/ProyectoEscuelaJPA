package com.intecap.proyectocolegio.domain.entities;

import com.intecap.proyectocolegio.util.GeneroEnum;
import com.intecap.proyectocolegio.util.PuntajeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity(name = "estudiante")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EstudianteEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private int id;

    @Column(length = 120)
    private String nombre;

    @Column(length = 120)
    private String apellido;

    @Column(length = 120)
    private String correo;

    @Column(length = 11)
    private int telefono;

    @Enumerated(EnumType.STRING)
    private GeneroEnum genero;

    @Column(length = 255)
    private String direccion;

    private LocalDate fecha_creacion;

    @OneToMany(mappedBy = "estudiante")
    private List<InscripcionEntity> inscripciones = new ArrayList<>();

}
