//Name: Shehzad Anwar
//Lab Letter: H
//Title: Lab4.java
//Date: 09//20/2019

import java.util.Scanner;
public class Lab4 
{

    public static void main(String []args) throws java.lang.Exception
    {
    	//TASK 1
        double num1; double num2;
        String op1="/"; String op2="*"; String op3="+"; String op4="=";
     Scanner in = new Scanner(System.in);
     System.out.print("Enter num1: ");
     num1 = in.nextInt();
     System.out.print("Enter num2: ");
     num2 = in.nextInt();
     System.out.print("Enter the operator: ");
     op1 = in.next();
     System.out.print("Enter the operator: ");
     op2 = in.next();
     System.out.print("Enter the operator: ");
     op3 = in.next();
     System.out.print("Enter the operator: ");
     op4 = in.next();
     
     switch(op1) 
    {case "/":System.out.println("The result of num1 / num2  = "+num1 / num2);break;
     case "*":System.out.println("The result of num1 * num2  = "+num1 * num2);break;
     case "+":System.out.println("The result of num1 + num2  = "+(num1 + num2));break;
     case "-":System.out.println("The result of num1 - num2  = "+(num1 - num2));break;}
    switch(op2) {
    case "/":System.out.println("The result of num1 / num2  = "+num1 / num2);break;
    case "*":System.out.println("The result of num1 * num2  = "+num1 * num2);break;
    case "+":System.out.println("The result of num1 + num2  = "+(num1 + num2));break;
    case "-":System.out.println("The result of num1 - num2  = "+(num1 - num2));break;
}
    switch(op3) {
    case "/":System.out.println("The result of num1 / num2  = "+num1 / num2);break;
    case "*":System.out.println("The result of num1 * num2  = "+num1 * num2);break;
    case "+":System.out.println("The result of num1 + num2  = "+(num1 + num2));break;
    case "-":System.out.println("The result of num1 - num2  = "+(num1 - num2));break;
}
    switch(op4) {
    case "/":System.out.println("The result of num1 / num2  = "+num1 / num2);break;
    case "*":System.out.println("The result of num1 * num2  = "+num1 * num2);break;
    case "+":System.out.println("The result of num1 + num2  = "+(num1 + num2));break;
    case "-":System.out.println("The result of num1 - num2  = "+(num1 - num2));break;
}
    
    //TASK 2
    double salary;
    int years;
    System.out.print("\nEnter your salary: ");
    salary= in.nextDouble();
     System.out.print("Enter how many years of service you have: ");
     years= in.nextInt();
     if (years>5) {
    	 System.out.println("Your net bonus is "+(.05*salary));
     }
     else {System.out.println("You get no bonus.");
   }
}
}
