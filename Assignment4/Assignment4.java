//package Assignment4;
//***********************************************************
// Name: Shehzad Anwar
// Title: Assignment4
// Description: Write the description in your words.
// Date: 10/7/19
//**********************************************************

//a) Key: A, Input 0s and 1s in one line, and put * at the end
//Key: R, The data is refreshed.
//Key: Q, *** End of Program ***
//b) else if (command == 'D') {
//                System.out.println("Display the result"); }
//c) The num0 is the int value that holds the number of 0's that the user enters, while the num1 is the int value that holds the number of 1's the user enters.
//d) System.out.printf("\n%4s|","Num0");
//                for(int i = 0; i < num0; i++) System.out.print("*");
//                System.out.println();
//                System.out.printf("\n%4s|","Num1");
//                for(int j = 0; j < num1; j++) System.out.print("*");
//                System.out.println();
//Output:
// Num0|***
//
// Num1|****
//e) num0 = num1 = 0;

import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        char command;
        Scanner in = new Scanner(System.in); //user input scan
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        double A = 0;
        double B = 0;
        double C = 0;
        double gpa;
        double total;

        do {
            System.out.println("Choose (A: add grades), (N: new grades), or (Q: quit)");
            String temp1 = in.next();
            command = temp1.toUpperCase().charAt(0);

            System.out.println(command);
            if (command == 'A') {
                System.out.println("Type a new list of input in single line.");
                while (!in.hasNextInt()) {
                    String input = in.next();
                    input = input.toUpperCase();
                    if (input.equals("A")) count1++;
                    else if (input.equals("B")) count2++;
                    else if (input.equals("C")) count3++;
                }
                in.next();
                total = count1 + count2 + count3;
                gpa = (count1 * 4.0) + (count2 * 3.0) + (count3 * 2.0);
                gpa = gpa / total;

                System.out.print("------------------------");
                System.out.printf("\n%4s|", "A");
                for (int i = 0; i < count1; i++) {
                    System.out.print("*");
                }
                System.out.println();

                System.out.printf("\n%4s|", "B");
                for (int j = 0; j < count2; j++) {
                    System.out.print("*");
                }
                System.out.println();

                System.out.printf("\n%4s|", "C");
                for (int k = 0; k < count3; k++) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.println("------------------------");
            }

             else if (command == 'N') {
                 count1=count2=count3=0;
                System.out.println("Type the additional input in single line.");
                while (!in.hasNextInt()) {
                    String input = in.next();
                    input = input.toUpperCase();
                    if (input.equals("A")) count1++;
                    else if (input.equals("B")) count2++;
                    else if (input.equals("C")) count3++;
                }
                in.next();
                total = count1 + count2 + count3;
                gpa = (count1 * 4.0) + (count2 * 3.0) + (count3 * 2.0);
                gpa = gpa / total;

                System.out.print("------------------------");
                System.out.printf("\n%4s|", "A");
                for (int i = 0; i < count1; i++) {
                    System.out.print("*");
                }
                System.out.println();

                System.out.printf("\n%4s|", "B");
                for (int j = 0; j < count2; j++) {
                    System.out.print("*");
                }
                System.out.println();

                System.out.printf("\n%4s|", "C");
                for (int k = 0; k < count3; k++) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.println("------------------------");
                }
            else if (command == 'Q') {
                System.out.println("*** End of Program ***");
            } else {
                System.out.println("Invalid command was input!");
            }
            System.out.println();
        }
        while (command != 'Q');
    }
}