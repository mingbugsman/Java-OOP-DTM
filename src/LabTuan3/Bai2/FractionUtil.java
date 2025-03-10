package LabTuan3.Bai2;

public class FractionUtil {
    private static int gcd(int a, int b) {
        return (b== 0) ? a : gcd(b, a%b);
    }
    public static int getGCD(int a, int b) {
        return gcd(a,b);
    }
    public static void simplify(Fraction fraction) {
        int numerator = fraction.getNumerator();
        int denominator = fraction.getDenominator();
        int gcd = gcd(Math.abs(numerator),Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        fraction.setNumerator(numerator);
        fraction.setDenominator(denominator);
    }
    public static void addFraction(Fraction f1, Fraction f2) {
        System.out.println(f1.toString() + " + " + f2.toString() + " : ");
        int numerator = f1.getNumerator()* f2.getDenominator() + f2.getNumerator()*f1.getDenominator();
        int denominator = f2.getDenominator() * f1.getDenominator();
        Fraction fraction = new Fraction(numerator, denominator);
        simplify(fraction);
        System.out.println(fraction.getNumerator() + "/" + fraction.getDenominator() + " ~ " + (1.0*fraction.getNumerator() / fraction.getDenominator()));
    }

    public static void subtract(Fraction f1, Fraction f2) {
        System.out.println(f1.toString() + " - " + f2.toString() + " : ");
        int num = f1.getNumerator() * f2.getDenominator() - f2.getNumerator() * f1.getDenominator();
        int den = f1.getNumerator() * f2.getDenominator();
        Fraction fraction = new Fraction(num, den);
        simplify(fraction);
        System.out.println(fraction.getNumerator() + "/" + fraction.getDenominator() + " ~ " + (1.0*fraction.getNumerator() / fraction.getDenominator()));
    }

    public static void divide(Fraction f1, Fraction f2) {
        System.out.println(f1.toString() + " / " + f2.toString() + " : ");
        int num = f1.getNumerator() * f2.getDenominator() ;
        int den = f1.getDenominator() * f2.getNumerator();
        Fraction fraction = new Fraction(num, den);
        simplify(fraction);
        System.out.println(fraction.getNumerator() + "/" + fraction.getDenominator() + " ~ " + (1.0*fraction.getNumerator() / fraction.getDenominator()));
    }

    public static void multiply(Fraction f1, Fraction f2) {
        System.out.println(f1.toString() + " * " + f2.toString() + " : ");
        int num = f1.getNumerator() * f2.getNumerator() ;
        int den = f1.getDenominator() * f2.getDenominator();
        Fraction fraction = new Fraction(num, den);
        simplify(fraction);
        System.out.println(fraction.getNumerator() + "/" + fraction.getDenominator() + " ~ " + (1.0*fraction.getNumerator() / fraction.getDenominator()));

    }

}
