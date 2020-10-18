import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab13 {public static void main(String[] args) throws FileNotFoundException {
    System.out.println("Enter the data file to compare: ");
    Scanner in = new Scanner(System.in);
    String temp = in.nextLine();
    in.close();
    File file = new File(temp);
    Scanner inFile = new Scanner(file);
    int odd = 0, even = 0;
    while(inFile.hasNextInt()){
        int i = inFile.nextInt();
        if(i%2==0)
            even = even + i;
        else
            odd = odd + i;
    }
    System.out.println("Sum of the odd numbers: "+odd);
    System.out.println("Sum of the even numbers: "+even);
    System.out.println("Difference of sum of even and sum of odd: "+Math.abs(odd-even));
    inFile.close();
}
}
