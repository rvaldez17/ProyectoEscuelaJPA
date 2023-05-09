package com.intecap.proyectocolegio.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "log")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class LogEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private int id;

    @Column(length = 255)
    private String tarea_realizada;

    private LocalDateTime fecha_hora_creacion;
}
