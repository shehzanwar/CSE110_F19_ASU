import java.util.Scanner;
import java.util.Arrays;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choice;
        char command;

        System.out.println("*** Start of Program***");
        printMenu();

        CardList c1 = new CardList(0);

        do {
            System.out.println("\n[Please enter a command or type ?] ");
            choice = in.next().toLowerCase();
            command = choice.charAt(0);

            switch (command)
            {
                case 'a':
                    System.out.println("[Input the size of cards]: ");
                    int ui = in.nextInt();
                    c1 = new CardList(ui);
                    System.out.println(c1.getHistory());
                    break;
                case 'b':
                    c1.flip();
                    System.out.println(c1.getHistory());
                    break;
                case 'c':
                    c1.shift();
                    System.out.println(c1.getHistory());
                    break;
                case 'd':
                    c1.shuffle();
                    System.out.println(c1.getHistory());
                    break;
                case 'e':
                    System.out.println("[Input the number of cards to change]: ");
                    int c = in.nextInt();
                    c1.change(c);
                    System.out.println(c1.getHistory());
                    break;
                case '?':
                    printMenu();
                    break;
            }
        } while (command != 'q');
        System.out.println("*** End of Program ***");
    }

    public static void printMenu()
    {
        System.out.print(
        "\nCommand Options\n"
                +"-----------------------------------\n"
                +"a: Create new cards\n"
                +"b: Flip the cards\n"
                +"c: Shift the cards\n"
                +"d: Shuffle the cards\n"
                +"e: Change the cards\n"
                +"?: Display the menu again\n"
                +"q: Quit this program\n\n");
    }
}
