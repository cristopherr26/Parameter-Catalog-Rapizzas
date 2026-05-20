package co.com.rapizzas.initializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ParameterCatalogRapizzasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParameterCatalogRapizzasApplication.class, args);
	}

}
