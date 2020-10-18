import java.util.Scanner;
class Circle {
    private double radius;

    public Circle() {
        radius = 0.0;
    }

    public Circle(double a) {
        radius = a;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}

public class Lab8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println("Enter the radius: ");
        double r = in.nextDouble();
        System.out.println("Enter the radius: ");
        double a = in.nextDouble();

        c1.setRadius(r);
        c2.setRadius(a);
        System.out.println("The circle has a radius of "+c1.getRadius()+" and area of "+c1.getArea());
        System.out.println("The circle has a radius of "+c2.getRadius()+" and area of "+c2.getArea());
    }
    }


