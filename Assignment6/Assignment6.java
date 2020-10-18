//***********************************************************
// Name: Shehzad Anwar
// Title: Assignment-6.java
// Author Info: Computer Science, Freshman
// Description: Assignment_6 calls the Fraction.java in its cases.
// Date: 11/8/19
//**********************************************************\

import java.util.*;
public class Assignment6 {
    public static void main(String[] args) {

        Scanner console = new Scanner (System.in);
        String choice;
        char command;

        // numbers used for input in the various cases
        int num1 = 0, num2 = 0;

        // print the menu
        System.out.println("*** Start of Program ***");
        printMenu();

        Fraction f1 = new Fraction(0, 0);
        Fraction f2 = new Fraction(0, 0);
        Fraction f3 = new Fraction(0, 0);

        do
        {
            // ask a user to choose a command
            System.out.println("\n[Please enter a command or type ?] ");
            choice = console.next().toLowerCase();
            command = choice.charAt(0);

            switch (command)
            {
                case 'c':
                    f1 = new Fraction(0,1);
                    f2 = f1;
                    f3 = f1;
                    System.out.println("Value: "+f1.toString());
                    break;
                case '*':
                    System.out.println("[Enter two numbers for a fraction to MULTIPLY] ");
                    f2 = f1;
                    num1 = console.nextInt();
                    num2 = console.nextInt();
                    f1 = new Fraction(num1, num2);
                    f3 = Fraction.multiply(f1,f2);
                    System.out.println(f2+" * "+f1+" = "+f3);
                    f1=f3;
                    System.out.println("Value: "+f1.toString());

                    break;
                case '/':
                    System.out.println("[Enter two numbers for a fraction to DIVIDE] ");
                    f2 = f1;
                    num1 = console.nextInt();
                    num2 = console.nextInt();
                    f1 = new Fraction(num1, num2);
                    f3 = Fraction.divide(f2,f1);
                    System.out.println(f2+" / "+f1+" = "+" = "+f3);
                    f1 = f3;
                    System.out.println("Value: "+f1.toString());

                    break;
                case '+':
                    System.out.println("[Enter two numbers for a fraction to ADD] ");
                    f2 = f1;
                    num1 = console.nextInt();
                    num2 = console.nextInt();
                    f1 = new Fraction(num1, num2);
                    f3 = Fraction.add(f1,f2);
                    System.out.println(f2+" + "+f1+" = "+f3);
                    f1 = f3;
                    System.out.println("Value: "+f1.toString());

                    break;
                case '-':
                    System.out.println("[Enter two numbers for a fraction to SUBTRACT] ");
                    f2 = f1;
                    num1 = console.nextInt();
                    num2 = console.nextInt();
                    f1 = new Fraction(num1, num2);
                    f3 = Fraction.subtract(f2,f1);
                    System.out.println(f2+" - "+f1+" = "+f3);
                    f1 = f3;
                    System.out.println("Value: "+f1.toString());
                    break;
                case '?':
                    printMenu();
                    System.out.println("Value: "+f1.toString());
                    break;
                case 'q':
                    break;
                default:
                    System.out.println("[Invalid input] " + command);
                    break;
            }
        } while (command != 'q');
        System.out.println("*** End of Program ***");
    }  //end of the main method


    public static void printMenu()
    {
        System.out.print(
                "\nCommand Options\n"
                        +"-----------------------------------\n"
                        +"c: reset the value\n"
                        +"+: add a fraction to the current value\n"
                        +"-: subtract a fraction from the current value\n"
                        +"*: multiply a fraction to the current value\n"
                        +"/: divide the current value by a fraction\n"
                        +"?: display the menu again\n"
                        +"q: quit this program\n\n");
    } // end of the printMenu method
}


