package com.hospital.citasHospital.service;

import com.hospital.citasHospital.model.Cita;

import java.util.List;

public interface CitaServiceI {

    public void Alta(Cita citaId);
    public void Baja(int indice);
    public List<Cita> Listado();

}
