import java.util.Random;

public class Dice {

    public final static int ONE = 0;
    public final static int TWO = 1;
    public final static int THREE = 2;
    public final static int FOUR = 3;
    public final static int FIVE = 4;
    public final static int SIX = 5;

    private int faceUp;

    public Dice() {
        rollDice();
    }

    public String rollDice() {
        Random rand = new Random();
        faceUp = rand.nextInt(6);

        if(faceUp == ONE) {
            return "ONE";
        } else if(faceUp == TWO) {
            return "TWO";
        } else if(faceUp == THREE) {
            return "THREE";
        } else if(faceUp == FOUR) {
            return "FOUR";
        } else if(faceUp == FIVE) {
            return "FIVE";
        } else {
            return "SIX";
        }
    }
}
