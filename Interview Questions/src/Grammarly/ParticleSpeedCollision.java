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
            } else 
        }
    }
}
