package com.example.demo.service;

import com.example.demo.domain.Calculator;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

  private Integer number1 = 0;
  private Integer number2 = 0;
  private String operation = "";

  @Override
  public String getResult(Calculator calculator) {
    if (Objects.nonNull(calculator.getNumber1())) {
      this.setNumber1(calculator.getNumber1());
      return "Por favor selecione o operador";
    }
    if (Objects.nonNull(calculator.getOperation())) {
      this.setOperation(calculator.getOperation());
      return "Por favor selecione o segundo numero";
    }
    if (Objects.nonNull(calculator.getNumber2())) {
      this.setNumber2(calculator.getNumber2());
    }
    return this.result(this.number1, this.operation, this.number2);
  }

  private void setNumber1(Integer number1) {
    this.number1 = number1;
  }

  private void setOperation(String operation) {
    this.operation = operation;
  }

  private void setNumber2(Integer number2) {
    this.number2 = number2;
  }

  private String result(Integer number1, String operation, Integer number2) {
    switch (operation) {
      case "*":
        Integer a = number1 * number2;
        return a.toString();
      case "/":
        Integer b = number1 / number2;
        return b.toString();
      case "+":
        Integer c = number1 + number2;
        return c.toString();
      case "-":
        Integer d = number1 - number2;
        return d.toString();
    }
    return "Operador não existe";
  }

}
