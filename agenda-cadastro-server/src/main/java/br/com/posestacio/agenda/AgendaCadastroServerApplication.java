package br.com.posestacio.agenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AgendaCadastroServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaCadastroServerApplication.class, args);
	}

}
