package com.hospital.citasHospital.infra.console;

import com.hospital.citasHospital.model.Cita;
import com.hospital.citasHospital.service.impl.CitaService;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConsoleReader {
    SimpleDateFormat fechaFormateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.forLanguageTag("es_ES"));

    public ConsoleReader(CitaService citaService) {
        this.citaService = citaService;
    }

    CitaService citaService;

    @PostConstruct
    public void Init(){
        Scanner sc = new Scanner(System.in);
        int opc=1;
        String entradaConsola;
        while (opc!=0){
            System.out.println("Menu por consola");
            System.out.println("1- Nueva cita");
            System.out.println("2- Borrar cita");
            System.out.println("3- Listar citas");
            System.out.println("0- Salir");
            entradaConsola=sc.next();
            try {
                opc=Integer.parseInt(entradaConsola);
            }
            catch (Exception e){
                System.out.println("Opción no válida, inserte un número");
            }
            switch (opc){
                case 0:
                    System.out.println("Hasta luego!");
                    break;
                case 1:
                    System.out.println("Inserte nombre");
                    String nombre=sc.next();
                    System.out.println("Inserte apellidos");
                    String apellidos=sc.next();
                    System.out.println("Ingrese fecha (dd/MM/YYYY HH:mm:ss): ");
                    String fecha = sc.nextLine();
                    Date fechaCita;
                    try{
                        fechaCita = fechaFormateador.parse(sc.nextLine());
                        citaService.Alta(new Cita(nombre,apellidos,fechaCita));
                    }
                    catch (ParseException e) {
                        System.out.println("Fecha no válida");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    List<Cita> citas=citaService.Listado();
                    for (Cita cita:citas) {
                        System.out.printf("Id %s, Nombre %s, Apellidos %s, Fecha %s",citas.indexOf(cita),cita.getNombre(),cita.getApellidos(),fechaFormateador.format(cita.getFecha()));
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("No valido");
                    break;
            }
        }
    }
}
