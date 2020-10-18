//***********************************************
//Name: Shehzad Anwar
//Lab Letter: H
//Title: Lab3.java
//Description: Lab3
//Date: 09/13/19
//***********************************************
import java.util.Scanner;
public class Lab3 {

	public static void main(String[] args) 
	{
		//TASK 1
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.next();
		System.out.print("Enter your gender: ");
		String gender = in.next();
		System.out.print("Enter your age: ");
		String age = in.next();
		System.out.print("Enter your mobile no.: ");
		String mobile = in.next();
		System.out.print("Enter your GPA: ");
		String GPA = in.next();
		System.out.println("\nName: "+name+
				"\nGender: "+gender+
				"\nAge: "+age+
				"\nMobile Number: "+mobile+
				"\nGPA: "+GPA);
		
		//TASK 2
		System.out.print("\nEnter a positive number: ");
		double ui1 = in.nextDouble();
		System.out.print("Enter an odd number: ");
		double ui2 = in.nextDouble();
		if (ui1>ui2)
		{
			double a = ui1/ui2;
			System.out.println("Result: "+a);
			System.out.println("Ceil: "+Math.ceil(a));
			System.out.println("Floor: "+Math.floor(a));
		}
		else if (ui2>ui1)
		{
			double a = ui2/ui1;
			System.out.println("Result: "+a);
			System.out.println("Ceil: "+Math.ceil(a));
			System.out.println("Floor: "+Math.floor(a));
		}
		System.out.print("\nEnter a negative number: ");
		double neg = in.nextDouble();
		System.out.println(Math.abs(neg));
		
		//TASK 3
		System.out.print("\nEnter your first name: ");
		String first = in.next();
		System.out.print("Enter your last name: ");
		String last = in.next();
		String full= first.concat(" ").concat(last);
		System.out.println("\nFirst Name: "+first+
				"\nLast Name: "+last+
				"\nFull Name: "+full);

	}

}
