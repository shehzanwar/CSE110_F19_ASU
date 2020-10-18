//Name: Shehzad Anwar
//Date: 11/22/2019
//Assignment: Lab12

import java.util.Scanner;

public class Lab12 {
    public static void main(String[] args) {
        //TASK 1
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 values for Array: ");
        for (int i=0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }


        selection(arr);
        System.out.println("\nSelection Sorted Array: ");
        for (int i:arr) {
            System.out.print(i+" ");
        }

        //************************************************************
        //TASK 2
        int[] arr2 = new int[10];
        System.out.println("\n\nEnter 10 values for the second Array: ");
        for (int i=0; i<arr2.length; i++) {
            arr2[i] = in.nextInt();
        }
        insertion(arr2);
        System.out.println("\nInsertion Sorted Array: ");
        for (int i:arr2) {
            System.out.print(i+" ");
        }
    }

    public static void selection(int[] arr) {
        for (int i = 0; i<arr.length-1;i++) {
            int index = i;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallNumber = arr[index];
            arr[index]=arr[i];
            arr[i]=smallNumber;
        }
    }

    public static void insertion(int[] arr) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int num = arr[j];
            int i = j-1;
            while ( (i > -1) && ( arr [i] > num ) ) {
                arr [i+1] = arr [i];
                i--;
            }
            arr[i+1] = num;
        }
    }
}

