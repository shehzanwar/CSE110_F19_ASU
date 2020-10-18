import java.util.Scanner;
public class Lab6 {
    public static void main(String[] args) {
        //TASK 1
        Scanner in = new Scanner(System.in);
        int A, B;
        System.out.print("Num 1: ");
        A = in.nextInt();
        System.out.print("Num 2: ");
        B = in.nextInt();
        System.out.println(A + "" + B + "\n");

        //TASK 2
        int num1;
        System.out.print("Num 1: ");
        num1 = in.nextInt();
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j+" ");
                System.out.println("");
        }
    }
}

