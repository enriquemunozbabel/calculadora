package com.calculadora;

import com.calculadora.infra.console.ConsoleReader;
import com.calculadora.repository.impl.CalculadoraRepository;
import com.calculadora.service.impl.CalculadoraService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraApplication {


	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);
		ConsoleReader consoleReader=new ConsoleReader(new CalculadoraService(new CalculadoraRepository()));
		consoleReader.Init();
	}

}
