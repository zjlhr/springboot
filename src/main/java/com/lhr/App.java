package com.lhr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lhr.server.dao")
// @ComponentScan("com.longcai.chinabba")
public class App {

	public static void main(String[] args) {

		SpringApplication.run(App.class, args);
	}
}
