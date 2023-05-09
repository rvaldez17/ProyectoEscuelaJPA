package com.intecap.proyectocolegio.domain.repository;
import com.intecap.proyectocolegio.domain.entities.ComentarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<ComentarioEntity, Long> {
}
