
package com.spring.citasService.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "citas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String medico;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime fechaHora;
    private String estado;
    
    
    
}
