public class Strings {
    public static void main (String[] args) {
        String userInput = "entertainment";
        String uppercased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        System.out.println("Contains: "+userInput.contains(("enter")));
    }
}
