package br.com.linsper.treinamento;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.inf.linsper.treinamento.entity", 
		"br.inf.linsper.treinamento.repository",
		"br.inf.linsper.treinamento.service"})
@EnableAutoConfiguration
public class ApplicationTesteTreinamento {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationTesteTreinamento.class, args);
	}
	
	@Bean
    public CommandLineRunner runProduto() throws Exception {
		return (String[] args) -> {
           
        };
	}
}
