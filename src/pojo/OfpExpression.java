package pojo;

public class OfpExpression {

  private final static String expressionTemplate = "%s %s %s";
  private OldFashionPound firstOperand;
  private int secondOperand;
  private OfpOperationType operationType;

  private OfpExpression() {}

  public int getFirstOperandAsInt() {
    return this.firstOperand.getValue();
  }

  public int getSecondOperand() {
    return this.secondOperand;
  }

  public OfpOperationType getOperation() {
    return this.operationType;
  }

  @Override
  public String toString() {
    // TODO: da rivedere come viene stampata l'operazione
    // TODO: da rivedere come il secondOperand viene stampato in base all'operazione: Ofp o int
    return String.format(expressionTemplate, firstOperand.toString(), operationType, secondOperand);
  }

  public static class OfpExpressionBuilder {

    private final OfpExpression expression;

    private OfpExpressionBuilder() {
      this.expression = new OfpExpression();
    }

    public static OfpExpressionBuilder builder() {
      return new OfpExpressionBuilder();
    }

    public OfpExpression build() {
      return this.expression;
    }

    public OfpExpressionBuilder setFirstOperand(OldFashionPound firstOperand) {
      this.expression.firstOperand = firstOperand;
      return this;
    }

    public OfpExpressionBuilder setSecondOperand(OldFashionPound secondOperand) {
      this.expression.secondOperand = secondOperand.getValue();
      return this;
    }

    public OfpExpressionBuilder setSecondOperand(int secondOperand) {
      this.expression.secondOperand = secondOperand;
      return this;
    }

    public OfpExpressionBuilder setOperationType(OfpOperationType operationType) {
      this.expression.operationType = operationType;
      return this;
    }

  }

}
