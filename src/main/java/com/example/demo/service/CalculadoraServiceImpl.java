package com.example.demo.service;

import com.example.demo.domain.Calculadora;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {

  private Integer number1 = 0;
  private Integer number2 = 0;
  private String operador = "";


  @Override
  public String getResult(Calculadora calculadora) {
    if (Objects.nonNull(calculadora.getNumber1())) {
      this.setNumber1(calculadora.getNumber1());
      return "Por favor selecione o operador";
    }
    if (Objects.nonNull(calculadora.getOperation())) {
      this.setOperador(calculadora.getOperation());
      return "Por favor selecione o segundo numero";
    }
    if (Objects.nonNull(calculadora.getNumber2())) {
      this.setNumber2(calculadora.getNumber2());
    }
    return this.result(this.number1, this.operador, this.number2);
  }

  private void setNumber1(Integer number1) {
    this.number1 = number1;
  }

  private void setOperador(String operador) {
    this.operador = operador;
  }

  private void setNumber2(Integer number2) {
    this.number2 = number2;
  }

  private String result(Integer number1, String operador, Integer number2) {
    switch (operador) {
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
