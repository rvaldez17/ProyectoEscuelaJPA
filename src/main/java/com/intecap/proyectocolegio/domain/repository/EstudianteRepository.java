package com.intecap.proyectocolegio.domain.repository;
import com.intecap.proyectocolegio.domain.entities.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<EstudianteEntity, Long> {
}
