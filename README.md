# Design Patterns - Fraction

Zadanie na podstawie http://www-home.fh-konstanz.de/~haase/lehre/patterns/exercises/exercise4.pdf

## Zadanie

W projekcie znajdują się następujące klasy lub interfejsy:
* `Fraction` - interfejs zawierający metody do wykonywania na ułamkach,
* `FractionBase` - klasa abstrakcyjna, która zawiera implementację jednej z metod interfejsu `Fraction` oraz metodę pomocniczną,
* `FractionNumberClient` - klasa do testów.

Celem zadania jest:
* utworzenie implementacji `FractionImpl` interfejsu `Fraction`, która będzie klasą pochodną klasy `FractionBase`,
* utworzyć dodatkową implementację `FractionImpl2`, która będzie klasą pochodną od standardowej klasy `Number`. Wykorzystać odpowiedni adapter, dzięki któremu będzie można wykorzystać częściową implementację z klasy `FractionBase`.
