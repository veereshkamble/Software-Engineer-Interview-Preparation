import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input 1 to Roll Dies and 2 to exit");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1) {
            Dice dice = new Dice();
            System.out.println("First Dice: "+dice.rollDice());
            System.out.println("Second Dice: "+dice.rollDice());
        } else if(option == 2) {
            System.out.println("Exiting Game");
        } else {
            System.out.println("Invalid option");
        }
    }
}
