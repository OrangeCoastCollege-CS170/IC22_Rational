# IC22_Rational
Create a class Rational that represents a rational (fractional) number.  It should have instance variables for:

* numerator (an integer)
* denominator (an integer)

and the following methods:

Rational(int numerator, int denominator) - a parameterized constructor for a rational number

* Accessor methods: getNumerator and getDenominator
* Mutator methods: setNumerator and setDenominator
* toString() method that prints a rational number like a fraction "-1/2".  Make sure if the fraction is negative, the symbol appears in front of the numerator.  If the fraction is a double-negative, print it as a positive fraction (e.g. "-1/-2" should be printed as "1/2").
* equals() method: two rational numbers are equal if their numerator and denominator values are the same.

You should use an exception to guarantee that the denominator is never zero.
