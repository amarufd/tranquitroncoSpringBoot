package cl.trepa.tranquitronco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TranquitroncoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TranquitroncoApplication.class, args);
	}

}

