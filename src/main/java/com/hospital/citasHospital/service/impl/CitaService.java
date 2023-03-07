package com.hospital.citasHospital.service.impl;

import com.hospital.citasHospital.model.Cita;
import com.hospital.citasHospital.repository.impl.CitaRepository;
import com.hospital.citasHospital.service.CitaServiceI;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaService implements CitaServiceI {
    private CitaRepository citaRepository;


    public CitaService( @Qualifier("Memory") CitaRepository citaRepository) {
        this.citaRepository=citaRepository;
    }

    public void Alta(Cita citaId) {
        citaRepository.Alta(citaId);
    }

    public void Baja(int indice) {
        citaRepository.Baja(indice);
    }

    public List<Cita> Listado() {
        return citaRepository.Listado();
    }
}
