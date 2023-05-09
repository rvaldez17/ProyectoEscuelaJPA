package com.intecap.proyectocolegio.domain.repository;
import com.intecap.proyectocolegio.domain.entities.InscripcionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscripcionRepository extends JpaRepository<InscripcionEntity, Long> {
}
