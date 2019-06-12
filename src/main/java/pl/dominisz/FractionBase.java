package pl.dominisz;

public abstract class FractionBase implements Fraction {

  protected int greatestCommonFactor(int a, int b) {
    if (a < b) return greatestCommonFactor(b, a);
    if (b == 0) return a;
    return greatestCommonFactor(a % b, b);
  }

  @Override
  public Fraction divide(Fraction other) {
    return this.multiply(other.reciprocal()).fullyReduce();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (!(o instanceof Fraction)) {
      return false;
    }

    Fraction other = (Fraction) o;

    if (this.isPositive() != other.isPositive()) {
      return false;
    }

    if (this.getNumerator() != other.getNumerator()) {
      return false;
    }

    return this.getDenominator() == other.getDenominator();
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (isPositive() ? 1 : 0);
    result = 31 * result + getNumerator();
    result = 31 * result + getDenominator();
    return result;
  }

  @Override
  public String toString() {
    String result = isPositive() ? "" : "-";
    result += getNumerator() + "/" + getDenominator();
    return result;
  }
}
