public class Fraction {
    private int  num, den;

    //Constructor
    public Fraction(int numerator, int denominator) {
        num = numerator;
        den = denominator;
        if (denominator == 0) {
            den = 1;
        }
    }

    public String toString() {
        if (num == 0) {
            return "0";
        }
        if (den == 1) {
            return ""+num;
        }
        if (den == num) {
            return "1";
        }
        else
        return num + "/" + den;
    }

    //GCD
    private int greatestCommonDivisor (int num1, int num2) {
        int common = 1;
        int a = Math.abs(num1), b = Math.abs(num2);
        while(a != b)
        {
            if (a < b) {
                b = b - a;
            }
            if (a > b) {
            a = a - b;
            }
        }
        if (a == 0)
            common = b;
        else
            common = a;
        return common;
    }

    //Simplify
    private void simplify() {
        int gcd = greatestCommonDivisor(num,den);
        if (den<0){
            num=num*-1/gcd;
            den=den*-1/gcd;
        }
        else{
        den = den/gcd;
        num = num/gcd;}
    }

    //Multiply
    public static Fraction multiply (Fraction a, Fraction b) {
        Fraction f1 = new Fraction((a.num*b.num),(a.den*b.den));
        f1.simplify();
        return f1;
    }

    //Divide
    public static Fraction divide (Fraction a, Fraction b) {
        Fraction f1 = new Fraction((a.num*b.den),(a.den*b.num));
        f1.simplify();
        return f1;
    }

    //Add
    public static Fraction add (Fraction a, Fraction b) {
        if((a.num*b.den + a.den*b.num)==0 || (a.num+b.num)==0){
            Fraction f1 = new Fraction((a.num+b.num),(a.den+b.den));
            f1.simplify();
            return f1;
        }
        if(a.den!=b.den) {
            Fraction f1 = new Fraction((a.num*b.den + a.den*b.num),(a.den*b.den));
            f1.simplify();
            return f1;
        }
        else if (a.den==b.den) {
            Fraction f1 = new Fraction((a.num+b.num),(a.den));
            f1.simplify();
            return f1;
        }
        return null;
    }

    //Subtract
    public static Fraction subtract (Fraction a, Fraction b) {
        if(a.den==0 || b.den==0){
            Fraction f1 = new Fraction((a.num-b.num),(a.den-b.den));
            f1.simplify();
            return f1;
        }
        if(a.den!=b.den)
            return new Fraction((a.num*b.den - a.den*b.num),(a.den*b.den));
        else if (a.den==b.den) {
            Fraction f1 = new Fraction((a.num-b.num),(a.den));
        f1.simplify();
        return f1;
        }
        return null;
    }
}
