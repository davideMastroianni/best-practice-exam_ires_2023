package pojo;

public class OldFashionPound {

  protected static final int poundToPence = 240;
  protected static final int shillingToPence = 12;
  protected static final String ofpTemplate = "%sp %ss %sd";
  private int value;

  public OldFashionPound(int pound, int shilling, int pence) {
    this.value = calculateTotalPence(pound, shilling, pence);
  }

  public OldFashionPound(int value) {
    this.value = value;
  }

  private int calculateTotalPence(int pound, int shilling, int pence) {
    return (pound * poundToPence) + (shilling * shillingToPence) + pence;
  }

  public int getValue() {
    return this.value;
  }

  @Override
  public String toString() {
    int actualPound = value / poundToPence;
    int actualShilling = (value % poundToPence) / shillingToPence;
    int actualPence = (value % poundToPence) % shillingToPence;
    return String.format(ofpTemplate, actualPound, actualShilling, actualPence);
  }

}
