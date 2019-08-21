package com.example.OCR.Spring.Boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import  net.sourceforge.tess4j.Tesseract ;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Tesseract tesseract =  new  Tesseract ();
	}

}
