package com.ravindar.gitlearm.gitfromscratch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class GitfromscratchApplication {

	public static void main(String[] args) {
		System.out.println("args = " + Arrays.deepToString(args));
		//Second test
		SpringApplication.run(GitfromscratchApplication.class, args);
		//random check
	}

}
