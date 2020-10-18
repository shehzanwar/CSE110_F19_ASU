//Name: Shehzad Anwar
//Assignment: Lab 9
//Date: 11/1/2019
public class Triangle {
    private double side1, side2, side3;

    public Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public String checkTriangle() {
        if ((side1 != side2) && (side1 != side3) && (side2 != side3))
            return ("Triangle is a scalene triangle.");
        if (((side1 == side2) && (side1 != side3)) ||
                ((side1 == side3) && (side1 != side2)) ||
                ((side2 == side3) && (side2 != side1)))
        {return ("Triangle is an isosceles triangle.");}
        if ((side1 == side2) && (side1 == side3))
        {return ("Triangle is an equilateral triangle.");}
        return "";
    }
}