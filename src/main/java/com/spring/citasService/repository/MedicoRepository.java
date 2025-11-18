
package com.spring.citasService.repository;

import com.spring.citasService.model.Cita;
import com.spring.citasService.model.Medico;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MedicoRepository  extends JpaRepository<Medico, Long>{
     List<Medico> findByNombre(String nombre); 
}
