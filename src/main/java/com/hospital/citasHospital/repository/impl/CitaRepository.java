package com.hospital.citasHospital.repository.impl;

import com.hospital.citasHospital.model.Cita;
import com.hospital.citasHospital.repository.CitaRepoI;

import java.util.ArrayList;
import java.util.List;

public class CitaRepository implements CitaRepoI {
    public CitaRepository() {
        citas = new ArrayList<>();
    }

    private List<Cita> citas;
    public void Alta(Cita citaId) {
        citas.add(citaId);
    }

    public void Baja(int indice) {
        citas.remove(indice);
    }

    public List<Cita> Listado() {
        return citas;
    }
}
