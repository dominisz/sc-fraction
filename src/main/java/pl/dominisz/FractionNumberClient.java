package pl.dominisz;

public class FractionNumberClient {

  /** @param args */
  public static void main(String[] args) {
    Fraction twoThird = new FractionImpl2(2, 3, true);
    Fraction threeFourth = new FractionImpl2(3, 4, true);

    System.out.println(twoThird + " * " + threeFourth + " = " + twoThird.multiply(threeFourth));

    System.out.println(twoThird + " as a decimal value: " + ((Number) twoThird).doubleValue());
  }
}
