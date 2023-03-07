package com.calculadora.service.impl;

import com.calculadora.repository.impl.CalculadoraRepository;
import com.calculadora.service.CalculadoraServiceI;
import com.calculadora.model.Calculadora;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculadoraService implements CalculadoraServiceI {
    private CalculadoraRepository calculadoraRepository;

    public CalculadoraService(CalculadoraRepository calculadoraRepository) {
        this.calculadoraRepository=calculadoraRepository;
    }

    public int sumar(int operando1, int operando2) {
        return calculadoraRepository.sumar(operando1,operando2);
    }

    public int restar(int operando1, int operando2) {
        return calculadoraRepository.restar(operando1,operando2);
    }

    public int multiplicar(int operando1, int operando2) {
        return calculadoraRepository.multiplicar(operando1,operando2);
    }

    public float dividir(int operando1, int operando2) {
        return calculadoraRepository.dividir(operando1,operando2);
    }
}
