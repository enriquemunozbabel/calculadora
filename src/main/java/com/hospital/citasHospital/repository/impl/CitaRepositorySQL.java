package com.hospital.citasHospital.repository.impl;

import com.hospital.citasHospital.model.Cita;
import com.hospital.citasHospital.repository.CitaRepoI;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("SQL")
public class CitaRepositorySQL implements CitaRepoI {
    @Override
    public void Alta(Cita citaId) {

    }

    @Override
    public void Baja(int indice) {

    }

    @Override
    public List<Cita> Listado() {
        return null;
    }
}
