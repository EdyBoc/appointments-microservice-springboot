package com.spring.citasService.service;

import com.spring.citasService.repository.MedicoRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class MedicoService {

    private final MedicoRepository medicoRepository
          
     @Autowired
    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

}
