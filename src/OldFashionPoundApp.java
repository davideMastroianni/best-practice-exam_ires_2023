import pojo.OfpExpression;
import pojo.OfpExpression.OfpExpressionBuilder;
import pojo.OfpOperationType;
import pojo.OldFashionPound;
import pojo.OldFashionPoundRemainder;
import service.ExpressionCalculator;

public class OldFashionPoundApp {

  public static void main(String[] args) {

    OldFashionPound firstOperand = new OldFashionPound(18, 16, 1);
    OldFashionPound secondOperand = new OldFashionPound(5, 18, 8);
    OfpOperationType operationType = OfpOperationType.DIV;

    OfpExpression expression = OfpExpressionBuilder.builder()
        .setFirstOperand(firstOperand)
        .setSecondOperand(15)
        .setOperationType(operationType)
        .build();

    System.out.println(expression);

    ExpressionCalculator calculator = ExpressionCalculator.getInstance();
    OldFashionPound result = calculator.calculate(expression);
    System.out.println(result);

  }
}