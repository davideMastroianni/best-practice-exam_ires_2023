package service;

import pojo.OldFashionPound;
import pojo.OldFashionPoundRemainder;

public class OfpDivision implements OfpArithmetic {

  @Override
  public OldFashionPound calculate(int firstOperand, int secondOperand) {
    // TODO: manage zero division.
    int result = firstOperand / secondOperand;
    int remainder = firstOperand % secondOperand;
    return new OldFashionPoundRemainder(result, remainder);
  }
}
