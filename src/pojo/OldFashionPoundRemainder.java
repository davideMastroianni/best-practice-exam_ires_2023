package pojo;

public class OldFashionPoundRemainder extends OldFashionPound {

  private final static String remainderTemplate = "%s (%s)";
  private int remainderValue;

  public OldFashionPoundRemainder(int value, int remainder) {
    super(value);
    this.remainderValue = remainder;
  }

  @Override
  public String toString() {
    int actualPound = remainderValue / poundToPence;
    int actualShilling = (remainderValue % poundToPence) / shillingToPence;
    int actualPence = (remainderValue % poundToPence) % shillingToPence;
    String remainder = String.format(ofpTemplate, actualPound, actualShilling, actualPence);
    String value = super.toString();
    return String.format(remainderTemplate, value, remainder);
  }

}
