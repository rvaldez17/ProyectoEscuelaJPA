package com.intecap.proyectocolegio.domain.repository;
import com.intecap.proyectocolegio.domain.entities.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long>{

}
