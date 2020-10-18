//NAME: SHEHZAD ANWAR
//LAB: 7
//DATE: 10/11/19
//DESCRIPTION: USER INPUT

import java.util.Scanner;
public class Lab7 {
    public static void main(String[] args) {

        //TASK 1
        int num0, num1, number0, number1, temp, tot2 = 0;
        int tot1 = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num0 = in.nextInt();
        number0 = num0;

        while (number0 != 0) {
            temp = number0 % 10;
            tot1 = tot1 + temp*temp*temp;
            number0 /= 10 ;
        }
        if (tot1 == num0) {
            System.out.println("It is an Armstrong number.");
        }
        else {
            System.out.println("Not an Armstrong number.");
        }

        //TASK 2
        String user1, user2 = "";
        String a = "";
        System.out.print("\nEnter a string: ");
        user1 = in.next();
        int length = user1.length();
        for (int i = length - 1; i >= 0; i--) {
            a = a + user1.charAt(1);
        }
        if (user1.equalsIgnoreCase(a)) {
            System.out.println("It's not a palindrome.");
        }
        else {
            System.out.println("It's a palindrome.");
        }

        //TASK 3
        int rows = 0;
        System.out.print("\nEnter a number: ");
        rows = in.nextInt();
        for (int k = 0; k < rows; k++) {
            for (int s = k; s <= rows; s++)
            {
                System.out.print(" ");
            }
            for (int l = 0; l <= k*2; l++) {
                System.out.print(k+1);
            }
            System.out.println();
        }
    }
}
