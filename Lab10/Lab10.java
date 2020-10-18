//Name: Shehzad Anwar
//Date: 11/8/19
//Lab ID: H
//Assignment: Lab10.java
//Topic: Arrays

import java.util.Scanner;
public class Lab10 {
    public static void main(String[] args) {

        //TASK 1
        Scanner in = new Scanner(System.in);
        int[] Arr = new int[5];
        int ui = 0;
        System.out.println("Enter first element: ");
        ui = in.nextInt();
        Arr[0]=ui;
        System.out.println("Enter second element: ");
        ui = in.nextInt();
        Arr[1]=ui;
        System.out.println("Enter third element: ");
        ui = in.nextInt();
        Arr[2]=ui;
        System.out.println("Enter fourth element: ");
        ui = in.nextInt();
        Arr[3]=ui;
        System.out.println("Enter fifth element: ");
        ui = in.nextInt();
        Arr[4]=ui;
        System.out.println(Arr[0]+" "+Arr[1]+" "+Arr[2]+" "+Arr[3]+" "+Arr[4]+"\n");


        //TASK 2
        int userInput = 0;
        System.out.println("Enter a number: ");
        userInput = in.nextInt();
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] += userInput;
        }
        System.out.println(Arr[0]+" "+Arr[1]+" "+Arr[2]+" "+Arr[3]+" "+Arr[4]+"\n");


        //TASK 3
        String[] Names = new String[5];
        String name1, name2, name3, name4, name5;
        System.out.println("Enter first name: ");
        name1 = in.next();
        Names[0] = name1;
        System.out.println("Enter second name: ");
        name2 = in.next();
        Names[1] = name2;
        System.out.println("Enter third name: ");
        name3 = in.next();
        Names[2] = name3;
        System.out.println("Enter fourth name: ");
        name4 = in.next();
        Names[3] = name4;
        System.out.println("Enter fifth name: ");
        name5 = in.next();
        Names[4] = name5;

        int index = 0;
        System.out.println("Enter the index you want to view: ");
        index = in.nextInt();
        System.out.println("\n"+Names[index]);
        }
    }

