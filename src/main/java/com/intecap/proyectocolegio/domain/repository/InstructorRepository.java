package com.intecap.proyectocolegio.domain.repository;
import com.intecap.proyectocolegio.domain.entities.InstructorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<InstructorEntity, Long> {
}
