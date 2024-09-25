package com.qrdemo.qrdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@RestController
@SpringBootApplication
public class QrDemoApplication {

	@getmapping ("/message")
	public String message () {
		return "qr server has been deployed in azure " ;
	}
	public static void main(String[] args) {
		SpringApplication.run(QrDemoApplication.class, args);
	}

}
