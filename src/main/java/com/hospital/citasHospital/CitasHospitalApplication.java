package com.hospital.citasHospital;

import com.hospital.citasHospital.infra.console.ConsoleReader;
import com.hospital.citasHospital.repository.impl.CitaRepository;
import com.hospital.citasHospital.service.CitaServiceI;
import com.hospital.citasHospital.service.impl.CitaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CitasHospitalApplication {


	public static void main(String[] args) {
		SpringApplication.run(CitasHospitalApplication.class, args);
		ConsoleReader consoleReader=new ConsoleReader(new CitaService(new CitaRepository()));
		consoleReader.Init();
	}

}
