package LabTuan3.Bai2;

import LabTuan3.Exception.ErrorCode;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction (int numerator, int denominator) {
        this.denominator = denominator;
        checkErrorAtDenominator(denominator);
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        checkErrorAtDenominator(denominator);
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "fraction is " + numerator + "/" + denominator;
    }

    private void checkErrorAtDenominator(int n) {
        if (denominator == 0) {
            System.out.println("ERROR :");
            System.out.println(ErrorCode.DENOMINATOR_INPUT_ERROR.getCode());
            System.out.println(ErrorCode.DENOMINATOR_INPUT_ERROR.getMessage());
        }
    }
}
