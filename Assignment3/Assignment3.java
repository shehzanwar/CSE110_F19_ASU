/*
Name: Shehzad Anwar
Date: 9/26/19
Assignment: Assignment 3
 */

/*
a) For Input (1,6,4) and (6,1,4), it returns a wrong output as (1, 0, 6) because once I enter 1 as the second value, it goes into negative numbers, so it fails to display properly. The other reason is that the value of the 'middle' integer is lost in the if-statements.
b) middle = c;
c) True, as the sign in between the statement is '>', meaning str1 would come after str2.
d) -32 because there is no sign between it to help identify what the user wants. The CPU does not know if the user wants to compare either that a is before or vice-versa.
e) (A) and (Z)
*/

import java.util.Scanner;

public class Assignment3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String name1, name2, name3, temp;
        boolean isValid = true;

        System.out.println("*** TASK: Read names and display them in alphabetical order ***");
        System.out.print("Please input the first name: ");
        name1 = in.next();
        char n1 = name1.charAt(0);
        if(n1 == '0' || n1 == '1' || n1 == '2' || n1 == '3' || n1 == '4' || n1 == '5' || n1 == '6' || n1 == '7' || n1 == '8' || n1 == '9') {
            System.out.println("Error: the first letter should be an alphabet");
            name1 = "";
        }
        else System.out.println(name1.toUpperCase());

        System.out.print("\nPlease input the second name: ");
        name2 = in.next();
        char n2 = name2.charAt(0);
        if (n2 == '0' || n2 == '1' || n2 == '2' || n2 == '3' || n2 == '4' || n2 == '5' || n2 == '6' || n2 == '7' || n2 == '8' || n2 == '9') {
            System.out.println("Error: the first letter should be an alphabet");
            name2 = "";
        }
        else if(name1.compareTo(name2) > 0)
        {
            System.out.println(name2.toUpperCase());
            System.out.println(name1.toUpperCase());
        }
        else {
            System.out.println(name1.toUpperCase());
            System.out.println(name2.toUpperCase());
        }

        System.out.print("\nPlease input the third name: ");
        name3 = in.next();
        char n3 = name3.charAt(0);
        if(n3 == '0' || n3 == '1' || n3 == '2' || n3 == '3' || n3 == '4' || n3 == '5' || n3 == '6' || n3 == '7' || n3 == '8' || n3 == '9') {
            System.out.println("Error: the first letter should be an alphabet");
            name3 = "";
        }
        if(name1.compareTo(name2) > 0 && name2.compareTo(name3) > 0 && name1.compareTo(name3) > 0)
        {
            System.out.println(name1.toUpperCase());
            System.out.println(name2.toUpperCase());
            System.out.println(name3.toUpperCase());
        }
        else if(name2.compareTo(name1) < 0 && name2.compareTo(name3) < 0 && name1.compareTo(name3) > 0)
        {
            System.out.println(name2.toUpperCase());
            System.out.println(name3.toUpperCase());
            System.out.println(name1.toUpperCase());
        }
        else if(name1.compareTo(name3) < 0 && name2.compareTo(name3) > 0 && name1.compareTo(name2) > 0)
        {
            System.out.println(name3.toUpperCase());
            System.out.println(name2.toUpperCase());
            System.out.println(name1.toUpperCase());
        }
        else if(name1.compareTo(name2) < 0 && name3.compareTo(name1) < 0 && name3.compareTo(name2) < 0)
        {
            System.out.println(name3.toUpperCase());
            System.out.println(name1.toUpperCase());
            System.out.println(name2.toUpperCase());
        }
        else if(name1.compareTo(name2) > 0 && name3.compareTo(name2) > 0 && name3.compareTo(name1) < 0)
        {
            System.out.println(name2.toUpperCase());
            System.out.println(name3.toUpperCase());
            System.out.println(name1.toUpperCase());
        }
        else if(name1.compareTo(name2)<0 && name1.compareTo(name3) <0 && name2.compareTo(name3) > 0)
        {
            System.out.println(name1.toUpperCase());
            System.out.println(name3.toUpperCase());
            System.out.println(name2.toUpperCase());
        }
        else if(name1=="");{
        if(name2.compareTo(name3) > 0)
        {
            System.out.println(name3.toUpperCase());
            System.out.println(name2.toUpperCase());
        }
        else {
            System.out.println(name2.toUpperCase());
            System.out.println(name3.toUpperCase());
        }
    }
    System.out.println("*** END OF Assignment#3 ***");

    }
}