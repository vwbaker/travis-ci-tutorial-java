package io.github.joaomlneto.travis_ci_tutorial_java;

public class SimpleCalculatorDriver {
  public static void main(String[] args) {
    int num = 21;
    SimpleCalculator calc = new SimpleCalculator();
    num = calc.mul(calc.mul(calc.mul(calc.mul(num, 3), 7), 13), 37);
    System.out.println("The answer is: " + num);
    
  }
}
