import java.util.Scanner;
import java.util.Arrays;
public class Lab11 {
    public static void main(String[] args) {
        int[][] Array = new int[4][4];
        int sum = 0;
        int max = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        for (int h=0;h<Array.length; h++){
            for (int g=0;g<Array.length; g++) {
                Array[h][g] = in.nextInt();
            }
        }

        for (int i=0;i<4;i++) {
            sum=0;
            max = 0;
            for (int j=0;j<4;j++) {
                sum += Array[i][j];
            }
            max = i+1;
        }
        System.out.println("Maximum sum is "+ sum+ " of row "+max);

        int[] arr2 = new int[10];
        System.out.println("Array: ");
        for (int h=0;h<arr2.length; h++){
            arr2[h] = in.nextInt();
        }
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int a = num;
        num--;
        if (num > 10) {
            num = num%10;
            num--;
        }
        while (num < 9) {
            int temp = arr2[num+1];
            arr2[num+1] = arr2[num];
            arr2[num] = temp;
            num+=a;
        }

        System.out.println(Arrays.toString(arr2));
    }
}
