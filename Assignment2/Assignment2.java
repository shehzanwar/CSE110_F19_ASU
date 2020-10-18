//*********************************************************** 
//Name: Shehzad Anwar
//Title: Assignment2.java
//Date: 09/012/2019
//***********************************************************

/*
Q1) 2.72 because the %.2f causes the double e to only print up to 2 digits after the decimal.
Q2) 	2.72 because the %10.2 causes spaces to be added so that the field width is 10.
Q3) 2.7182818284 because it uses s with a string.
Q4) It prints an error because it fails to convert the double to a Java language.
Q5) 3 because it rounds the digit to the nearest whole number with 0 digits after the decimal.
 */
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) 
	{
		//TASK 1
		Scanner in = new Scanner(System.in);
		System.out.println("*** TASK 1: Calculate the average of three inputs ***");
		System.out.print("\nPlease input the first integer: ");
		double userInput1 = in.nextDouble();
		
		System.out.print("\nPlease input the second integer: ");
		double userInput2 = in.nextDouble();
		
		System.out.print("\nPlease input the third integer: ");
		double userInput3 = in.nextDouble();
		
		double userAvg = (userInput1 + userInput2 + userInput3)/3;
		System.out.printf("The average of the three integers is: "+"%.2f", userAvg);
		
		
		//TASK 2
		System.out.println("\n\n*** TASK 2: Display the data of name ***");
		System.out.print("\nWhat is your first name?: ");
		String firstName = in.next();
		firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
		System.out.print("\nWhat is your last name?: ");
		String lastName = in.next();
		lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
		int length = firstName.length()+lastName.length();
		System.out.println("Your name is: "+"\""+firstName+" "+lastName+"\"");
		System.out.println("The total number of characters is: "+length);
		System.out.println("The initial letter is: "+firstName.substring(0,1));
		System.out.println("The last letter is: "+lastName.charAt(lastName.length() -1));
		
		
		//TASK 3
		System.out.println("\n\n*** TASK 3: Calculate the cosine and sine values ***");
		System.out.print("\nPlease input the degree: ");
		double deg = in.nextDouble();
		double rad = Math.toRadians(deg);
		System.out.println("Radian of "+deg+" degree(s) is: "+rad);
		double cos = Math.cos(rad);
		System.out.println("cos("+deg+") =: "+String.format("%.2f", cos));
		double sin = Math.sin(rad);
		System.out.println("sin("+deg+") =: "+String.format("%.2f", sin));
		
	}

}
