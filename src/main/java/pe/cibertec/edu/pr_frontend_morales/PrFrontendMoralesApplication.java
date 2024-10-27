package pe.cibertec.edu.pr_frontend_morales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class PrFrontendMoralesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrFrontendMoralesApplication.class, args);
	}

}
