
//*********************************************************** 
//Name: Shehzad Anwar
//Title: Assignment1.java
//Description: Calculate the total and average money. 
//Date: 09/05/2019
//***********************************************************

/*
 * a) It was not compiled successfully because it could not find or load main class TotalAndAverage.java.
 * b) It doesn't generate any compile error, but there is a syntax error as there is no quotation in the beginning of the statement.
 * c) The code does not have any compile errors, and goes about as normal.
 * d) There is a syntax error as there is no "}" to finish the ClassBody.
 * e) There is a syntax error because String literal is not properly closed by a double quote.
 */

public class Assignment1 {

	public static void main(String[] args) 
	{
		int people = 4;
		double john_amount = 56.25;
		double mary_amount = 80.78;
		double chris_amount = 22.53;
		double yoshi_amount = 5.16;
		double total = john_amount+mary_amount+chris_amount+yoshi_amount;
		double average = total/people;
		System.out.println("\"Financial Information\"");
		System.out.println("NAME    \tAmount");
		System.out.println("------    \t-----------------");
		System.out.println("John    \t$"+(int)john_amount+"  and  "+((int)((john_amount-(int)john_amount)*100))+"/100");
		System.out.println("Mary    \t$"+(int)mary_amount+"  and  "+((int)((mary_amount-(int)mary_amount)*100))+"/100");
		System.out.println("Chris   \t$"+(int)chris_amount+"  and  "+((int)((chris_amount-(int)chris_amount)*100))+"/100");
		System.out.println("Yoshi   \t$"+(int)yoshi_amount+"   and  "+((int)((yoshi_amount-(int)yoshi_amount)*100))+"/100");
		System.out.println("---------------------------------");
		System.out.println("Total   \t$"+(int)total+" and  "+((int)((total-(int)total)*100))+"/100");
		System.out.println("Average \t$"+(int)average+"  and  "+((int)((average-(int)average)*100))+"/100");
	}

}
