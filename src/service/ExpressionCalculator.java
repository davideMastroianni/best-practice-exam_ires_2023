package service;

import pojo.OfpExpression;
import pojo.OldFashionPound;

public class ExpressionCalculator {

  private static ExpressionCalculator instance;
  private final OfpArithmeticFactory arithmeticFactory;

  private ExpressionCalculator(OfpArithmeticFactory arithmeticFactory) {
    this.arithmeticFactory = arithmeticFactory;
  }

  public static ExpressionCalculator getInstance() {
    if (instance == null) {
      OfpArithmeticFactory arithmeticFactory = OfpArithmeticFactory.getInstance();
      instance = new ExpressionCalculator(arithmeticFactory);
    }
    return instance;
  }

  public OldFashionPound calculate(OfpExpression expression) {
    OfpArithmetic arithmetic = arithmeticFactory.generate(expression.getOperation());
    return arithmetic.calculate(expression.getFirstOperandAsInt(), expression.getSecondOperand());
  }

}
