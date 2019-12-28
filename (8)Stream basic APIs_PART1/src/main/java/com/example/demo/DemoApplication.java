package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

       Stream<String> build = Stream.<String>builder().add("kk").add("PK").add("MK").build();
       build.forEach(System.out::println);

       System.out.println("---------------------------");

       Stream<String> limit = Stream.generate(()->"Hello").limit(10);
       limit.forEach(System.out::println);

    }

}
