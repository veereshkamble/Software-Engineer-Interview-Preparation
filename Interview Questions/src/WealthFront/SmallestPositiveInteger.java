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

        for( int i = 0; i < A.length; i++) {
            if(!hashSet.contains(i+1)) {
                return i+1;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] A = new int[] {1, 5, 4, 2, 6};
        SmallestPositiveInteger smallestPositiveInteger = new SmallestPositiveInteger();
        System.out.println(smallestPositiveInteger.solution(A));
    }
}
