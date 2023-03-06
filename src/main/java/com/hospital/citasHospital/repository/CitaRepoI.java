package com.hospital.citasHospital.repository;

import com.hospital.citasHospital.model.Cita;

import java.util.List;

public interface CitaRepoI {

    public void Alta(Cita citaId);
    public void Baja(int indice);
    public List<Cita> Listado();

}
