package com.datajpa.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Scanner getScanner() {
		return new Scanner(System.in);
	}
}
