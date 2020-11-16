package com.example.demo.controller;

import com.example.demo.domain.Calculadora;
import com.example.demo.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

  @Autowired
  private CalculadoraService calculadoraService;

  @PostMapping("/v1/test")
  public String getResult(@RequestBody Calculadora calculadora){
    return calculadoraService.getResult(calculadora);

  }
}
