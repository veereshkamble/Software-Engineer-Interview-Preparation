package ArraysAndStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementDifference {

 /*   Given 2 arrays of element A and B, return 2 arrays containing elements in A but not in B, and elements in B but not in A.

    Example:
    Inputs:
    A = [1, 2, 5, 5, 5]
    B = [2, 4, 5]

    Outputs:
    L1 = [1, 5, 5]
    L2 = [4]*/

    public List<List<Integer>> elementDiff(int[] A, int[] B) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        Map<Integer, Integer> mapA = new HashMap<>();
        Map<Integer, Integer> mapB = new HashMap<>();

        for(int i = 0; i < A.length; i++) {
            if(mapA.containsKey(A[i])) {
                int count = mapA.get(A[i]);
                count++;
                mapA.put(A[i], count);
            } else {
                mapA.put(A[i], 1);
            }
        }

        for(int i = 0; i < B.length; i++) {
            if(mapB.containsKey(B[i])) {
                int count = mapB.get(B[i]);
                count++;
                mapB.put(B[i], count);
            } else {
                mapB.put(B[i], 1);
            }
        }






    }

}
