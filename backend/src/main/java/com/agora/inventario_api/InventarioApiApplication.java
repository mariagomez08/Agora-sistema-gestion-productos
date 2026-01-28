package com.agora.inventario_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
	io.awspring.cloud.autoconfigure.s3.S3AutoConfiguration.class
})
public class InventarioApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventarioApiApplication.class, args);
	}

}
