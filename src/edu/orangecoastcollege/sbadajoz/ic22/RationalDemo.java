package edu.orangecoastcollege.sbadajoz.ic22;
/*
Badajoz, Seve
CS A170
November 18, 2016

IC22
*/
public class RationalDemo {
    public static void main(String[] args) {
        try {
            Rational r1 = new Rational(2, 3);
            System.out.println(r1);
            Rational r2 = new Rational(-2, 3);
            System.out.println(r2);
            Rational r3 = new Rational(-2, -3);
            System.out.println(r3);
            Rational r4 = new Rational(2, 0);
            System.out.println(r4);
        } catch (ZeroDenominatorException e){
            System.out.println(e.getMessage());
        }
    }
}
