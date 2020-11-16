package com.example.demo.controller;

import com.example.demo.domain.Calculator;
import com.example.demo.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

  @Autowired
  private CalculatorService calculatorService;

  @PostMapping("/v1/test")
  public String getResult(@RequestBody Calculator calculator){
    return calculatorService.getResult(calculator);

  }
}
