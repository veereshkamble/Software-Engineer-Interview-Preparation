public class Main {
    public static void main(String[] args) {
        Coin c = new Coin();

        System.out.println("Initial :" +c.getFaceUp());

        for(int i=0; i<10; i++) {
            c.flip();
            System.out.println("Face up: " + c.getFaceUp());
        }
    }
}
