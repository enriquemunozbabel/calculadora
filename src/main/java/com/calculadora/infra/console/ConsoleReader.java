package com.calculadora.infra.console;

import com.calculadora.model.Calculadora;
import com.calculadora.service.impl.CalculadoraService;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConsoleReader {

    public ConsoleReader(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    CalculadoraService calculadoraService;

    @PostConstruct
    public void Init(){
        Scanner sc = new Scanner(System.in);
        int opc=1;
        int op1=1;
        int op2=1;
        String entradaConsola;
        while (opc!=5){
            System.out.println("\nBienvenido a la calculadora, selecciona una operación");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Salir");
            System.out.println("\nSelecciona una operación:");
            entradaConsola=sc.next();
            try {
                opc=Integer.parseInt(entradaConsola);
            }
            catch (Exception e){
                System.out.println("Opción no válida, inserte un número");
            }
            if(opc!=5){
            System.out.println("Inserte el primer operando");
            op1=Integer.parseInt(sc.next());
            System.out.println("Inserte el segundo operando");
            op2=Integer.parseInt(sc.next());
            }

            switch (opc){
                case 5:
                    System.out.println("Hasta luego!");
                    break;
                case 1:
                    System.out.printf("Resultado: %d",calculadoraService.sumar(op1,op2));
                    break;
                case 2:
                    System.out.printf("Resultado: %d",calculadoraService.restar(op1,op2));
                    break;
                case 3:
                    System.out.printf("Resultado: %d",calculadoraService.multiplicar(op1,op2));
                    break;
                case 4:
                    System.out.printf("Resultado: %2f",calculadoraService.dividir(op1,op2));
                    break;
                default:
                    System.out.println("No valido");
                    break;
            }
        }
    }
}
