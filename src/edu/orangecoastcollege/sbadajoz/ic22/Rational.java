package edu.orangecoastcollege.sbadajoz.ic22;
/*
Badajoz, Seve
CS A170
November 18, 2016

IC22
*/
public class Rational {
 private int mNumerator;
 private int mDenominator;
 
 public Rational(int numerator, int denominator) throws ZeroDenominatorException{
     mNumerator = numerator;
     if(denominator == 0) throw new ZeroDenominatorException("Denominator cannot be zero.");
     mDenominator = denominator;
 }

public int getnumerator()
{
    return mNumerator;
}

public int getDenomiator()
{
    return mDenominator;
}

public void setNumerator(int numerator)
{
    this.mNumerator = numerator;
}

public void setDenominator(int denominator) throws ZeroDenominatorException
{
    if(denominator == 0) throw new ZeroDenominatorException("Denominator cannot be zero.");
    this.mDenominator = denominator;
}
 public String toString() {
     if((mNumerator > 0 && mDenominator > 0) || (mNumerator < 0 && mDenominator < 0))
     return Math.abs(mNumerator) + "/" + Math.abs(mDenominator);
     else return "-" + Math.abs(mNumerator) + "/" + Math.abs(mDenominator);
 }
 
}
