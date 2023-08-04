package service;

import pojo.OfpOperationType;
import pojo.OldFashionPound;

public class OfpArithmeticFactory {

  private static OfpArithmeticFactory instance;

  private OfpArithmeticFactory() {}

  public static OfpArithmeticFactory getInstance() {
    if (instance == null) {
      instance = new OfpArithmeticFactory();
    }
    return instance;
  }

  public OfpArithmetic generate(OfpOperationType operationType) {
    switch (operationType) {
      case SUM:
        return new OfpAddition();
      case SUB:
        return new OfpSubtraction();
      case MUL:
        return new OfpMultiplication();
      case DIV:
        return new OfpDivision();
      default:
        throw new IllegalArgumentException(); // TODO: use a specific implementation with a message
    }
  }

}
