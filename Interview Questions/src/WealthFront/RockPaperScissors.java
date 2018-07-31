package WealthFront;
import java.util.*;


public class RockPaperScissors {

    public int solution(String G) {
        // write your code in Java SE 8
        char[] gestures = new char[] {'R', 'P', 'S'};
        char[] gestureGiovanni = G.toCharArray();
       // char gestureFranco = gestures[(int)Math.random()%3];

        //Scanner scan = new Scanner(System.in);
        //char gestureFranco = scan.next().charAt(0);

        Random r = new Random();
        int Low = 0 ;
        int High = 3;
        int Result = r.nextInt(High-Low) + Low;
        char gestureFranco = gestures[Result];



        int totalScore = 0;
        int win = 2;
        int draw = 1;
        int loss = 0;

        for(int i = 0; i < gestureGiovanni.length; i++) {
            if(gestureFranco == 'R') {
                if(gestureGiovanni[i] == 'S') {
                    totalScore += win;
                } else if(gestureGiovanni[i] == 'R') {
                    totalScore += draw;
                } else {
                    totalScore += loss;
                }
            } else if(gestureFranco == 'P') {
                if(gestureGiovanni[i] == 'R') {
                    totalScore += win;
                } else if(gestureGiovanni[i] == 'P') {
                    totalScore += draw;
                } else {
                    totalScore += loss;
                }
            } else if(gestureFranco == 'S') {
                if(gestureGiovanni[i] == 'P') {
                    totalScore += win;
                } else if(gestureGiovanni[i] == 'S') {
                    totalScore += draw;
                } else {
                    totalScore += loss;
                }
            }
        }
        return totalScore;
    }

    public static  void  main(String[] args){
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        System.out.println(rockPaperScissors.solution("SRR"));
    }
}
