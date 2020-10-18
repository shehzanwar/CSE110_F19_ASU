import java.util.Scanner;
public class Lab5
{
    public static void main(String []args)
    {
        //TASK 1
        Scanner in = new Scanner(System.in);
        String user1, user2;
        System.out.print("String 1: ");
        user1 = in.nextLine();
        System.out.print("String 2: ");
        user2 = in.nextLine();
        if (user1.compareTo(user2)<0)
        {System.out.println(user1+" than "+user2);}
        else System.out.println(user2+" than "+user1);

        //TASK 2
        String u1;
        int i;
        System.out.print("\nEnter a string: ");
        u1 = in.nextLine();
        System.out.print("Enter index to be searched: ");
        i = in.nextInt();
        System.out.print("The character at position "+i+" is "+u1.charAt(i));

        //TASK 3
        int mark;
        System.out.print("\n\nEnter your mark: ");
        mark = in.nextInt();
        if (mark >= 91 && mark <= 100){
            System.out.println("Grade = A");
        }
        else if (mark >= 81 && mark <= 90){
            System.out.println("Grade = B");
        }
        else if (mark >= 71 && mark <= 80){
            System.out.println("Grade = C");
        }
        else if (mark >= 61 && mark <= 70){
            System.out.println("Grade = D");
        }
        else if (mark <= 60){
            System.out.println("Grade = F");
        }
    }
}
