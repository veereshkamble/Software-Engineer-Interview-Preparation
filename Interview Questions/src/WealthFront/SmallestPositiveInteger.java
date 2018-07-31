package WealthFront;
import java.util.*;

public class SmallestPositiveInteger {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int min = Integer.MIN_VALUE;

        Set<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < A.length; i++) {
            if(A[i] > 0 && !hashSet.contains(A[i])) {
                hashSet.add(A[i]);
            }
        }

        for( int i = 1; i <= A.length; i++) {
            if(!hashSet.contains(i)) {
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {

    }
}
