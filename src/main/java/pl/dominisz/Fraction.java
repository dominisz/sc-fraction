package pl.dominisz;

public interface Fraction {
  boolean isPositive();

  int getNumerator(); // only positive values possible

  int getDenominator(); // only positive values possible

  Fraction fullyReduce();

  Fraction reciprocal();

  Fraction multiply(Fraction other); // returns fully reduced product

  Fraction divide(Fraction other); // returns fully reduced quotient
}
