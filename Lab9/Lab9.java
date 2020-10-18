//Name: Shehzad Anwar
//Assignment: Lab 9
//Date: 11/1/2019
import java.util.Scanner;

public class Lab9{
    public static void main(String[] args){
        double side1, side2, side3;
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first side: ");
        side1 = in.nextDouble();
        System.out.println("Input the second side: ");
        side2 = in.nextDouble();
        System.out.println("Input the third side: ");
        side3 = in.nextDouble();
        Triangle myTriangle = new Triangle(side1, side2, side3);
        System.out.println(myTriangle.checkTriangle());
    }
    }
