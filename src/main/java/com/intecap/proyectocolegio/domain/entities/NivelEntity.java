package com.intecap.proyectocolegio.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity(name = "nivel")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class NivelEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private int id;

    @Column(length = 45)
    private String tipo;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToOne(mappedBy = "nivel")
    private CursoEntity curso;
}