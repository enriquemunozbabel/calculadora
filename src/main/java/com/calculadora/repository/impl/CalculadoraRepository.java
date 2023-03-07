package com.calculadora.repository.impl;

import com.calculadora.repository.CalculadoraRepoI;
import org.springframework.stereotype.Repository;

@Repository
public class CalculadoraRepository implements CalculadoraRepoI {


    public CalculadoraRepository() {
    }

    public int sumar(int operando1, int operando2) {
        return operando1+operando2;
    }

    public int restar(int operando1, int operando2) {
        return operando1-operando2;
    }

    public int multiplicar(int operando1, int operando2) {
        return operando1*operando2;
    }

    public float dividir(int operando1, int operando2) {
        return (float)operando1/operando2;
    }

}
