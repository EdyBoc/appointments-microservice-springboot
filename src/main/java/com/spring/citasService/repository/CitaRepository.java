
package com.spring.citasService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.citasService.model.Cita;
import java.util.List;


@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
    List<Cita> findByEstado(String estado);  // Buscar citas por estado
} 

