package service;

import pojo.OldFashionPound;

public class OfpAddition implements OfpArithmetic {

  @Override
  public OldFashionPound calculate(int firstOperand, int secondOperand) {
    return new OldFashionPound(firstOperand + secondOperand);
  }
}
