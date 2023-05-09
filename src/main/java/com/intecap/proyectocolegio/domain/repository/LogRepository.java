package com.intecap.proyectocolegio.domain.repository;
import com.intecap.proyectocolegio.domain.entities.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<LogEntity, Long> {
}
