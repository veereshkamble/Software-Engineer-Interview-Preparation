import java.util.Scanner;

public class Strings {
    public static void main (String[] args) {
        System.out.println("Enter a word: ");
        Scanner sc = new Scanner(System.in);

        String userInput = sc.next();
        String uppercased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        System.out.println("Contains: "+userInput.contains(("enter")));
    }
}
