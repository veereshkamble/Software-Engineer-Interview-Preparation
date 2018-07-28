package Grammarly;
import java.util.*;

public class ParticleSpeedCollision {

    //Complete the Collision function below
    static int collision(List<Integer> speed, int pos) {
        int numCollisions = 0;
        int count = 0;

        for(Integer particleSpeed : speed) {
            if(count < pos) {
                if(speed.get(pos) < particleSpeed) {
                    numCollisions++;
                }
            } else if(count > pos) {
                if(speed.get(pos) > particleSpeed) {
                    numCollisions++;
                }
            }
            count++;
        }
        return numCollisions;
    }

    public static void main(String[] args) {
        List<Integer> speed = new ArrayList<Integer>();
        speed.add(6);
        speed.add(6);
        speed.add(1);
        speed.add(5);
        speed.add(4);
        speed.add(7);
        speed.add(8);

        int pos = 2;


        System.out.println(ParticleSpeedCollision.collision(speed, pos));
    }
}
