package br.com.linsper.treinamento;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import br.com.linsper.treinamento.entity.FuncionarioEntity;
import br.com.linsper.treinamento.service.FuncionarioService;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.linsper.treinamento.entity", 
		"br.com.linsper.treinamento.repository",
		"br.com.linsper.treinamento.service"})
@EnableAutoConfiguration
public class ApplicationTesteTreinamento {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationTesteTreinamento.class, args);
	}
	
	@Bean
    public CommandLineRunner runProduto(FuncionarioService service) throws Exception {
		return (String[] args) -> {
			FuncionarioEntity funcionario = new FuncionarioEntity();
			funcionario.setId(UUID.randomUUID());
			funcionario.setNome("JOAO");
			service.insert(funcionario);
            service.teste();
        };
	}
}
