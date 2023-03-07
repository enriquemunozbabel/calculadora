package com.calculadora.service;

import com.calculadora.model.Calculadora;

import java.util.List;

public interface CalculadoraServiceI {

    public int sumar(int operando1, int operando2);

    public int restar(int operando1, int operando2);

    public int multiplicar(int operando1, int operando2);

    public float dividir(int operando1, int operando2);
}
