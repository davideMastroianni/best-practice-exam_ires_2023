package service;

import pojo.OldFashionPound;

public class OfpMultiplication implements OfpArithmetic {

  @Override
  public OldFashionPound calculate(int firstOperand, int secondOperand) {
    return new OldFashionPound(firstOperand * secondOperand);
  }
}
