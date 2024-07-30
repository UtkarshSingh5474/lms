package com.lms;

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@OpenAPIDefinition()
@SpringBootApplication()
class CoreApplication

fun main(args: Array<String>){
  runApplication<CoreApplication>(*args)
}

