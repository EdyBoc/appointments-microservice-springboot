

package com.spring.citasService.controller;

import org.springframework.web.bind.annotation.*;
import com.spring.citasService.service.CitaService;
import com.spring.citasService.model.Cita;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/citas")
public class CitaController {

    private final CitaService citaService;

    public CitaController(CitaService citaService) {
        this.citaService = citaService;
    }

    @GetMapping
    public List<Cita> listarCitas() {
        return citaService.listarCitas();
    }

    @GetMapping("/{id}")
    public Optional<Cita> obtenerCita(@PathVariable Long id) {
        return citaService.obtenerCitaPorId(id);
    }

    @PostMapping
    public Cita crearCita(@RequestBody Cita cita) {
        return citaService.guardarCita(cita);
    }

    @DeleteMapping("/{id}")
    public void eliminarCita(@PathVariable Long id) {
        citaService.eliminarCita(id);
    }

}