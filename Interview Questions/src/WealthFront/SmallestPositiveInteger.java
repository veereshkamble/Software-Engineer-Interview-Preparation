package WealthFront;
import java.util.*;

public class SmallestPositiveInteger {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int fullFlag = 1;
        int max = Integer.MIN_VALUE;

        Set<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < A.length; i++) {
            if (A[i] >= max) {

                max = A[i];
            }
            if(A[i] > 0 && !hashSet.contains(A[i])) {
                hashSet.add(A[i]);
            }
        }

        for( int i = 0; i < A.length; i++) {
            if(hashSet.size() == 1) {
                return A[i] + 1;
            }
            if(!hashSet.contains(i+1)) {
                fullFlag = 0;
                return i+1;
            }
        }

        return fullFlag == 1 ? max + 1 : 1;
    }
    public static void main(String[] args) {
        int[] A = new int[] {3, 2, 1};
        SmallestPositiveInteger smallestPositiveInteger = new SmallestPositiveInteger();
        System.out.println(smallestPositiveInteger.solution(A));
    }
}
