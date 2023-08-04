package service;

import pojo.OldFashionPound;
import pojo.OldFashionPoundRemainder;

public class OfpSubtraction implements OfpArithmetic {

  @Override
  public OldFashionPound calculate(int firstOperand, int secondOperand) {
    int result = firstOperand - secondOperand;
    if (result >= 0) {
      return new OldFashionPound(result);
    } else {
      return new OldFashionPoundRemainder(0, Math.abs(result));
    }
  }
}
