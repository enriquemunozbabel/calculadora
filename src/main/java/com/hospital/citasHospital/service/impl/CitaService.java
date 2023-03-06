package com.hospital.citasHospital.service.impl;

import com.hospital.citasHospital.model.Cita;
import com.hospital.citasHospital.repository.impl.CitaRepository;
import com.hospital.citasHospital.service.CitaServiceI;

import java.util.ArrayList;
import java.util.List;

public class CitaService implements CitaServiceI {
    CitaRepository citaRepository;

    public CitaService(CitaRepository citaRepository) {
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
