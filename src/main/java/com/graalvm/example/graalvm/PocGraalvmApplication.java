package com.graalvm.example.graalvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(proxyBeanMethods = false)
public class PocGraalvmApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocGraalvmApplication.class, args);
	}

}
