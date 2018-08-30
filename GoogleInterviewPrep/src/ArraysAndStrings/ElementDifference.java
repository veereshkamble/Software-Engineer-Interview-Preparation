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





        // A = [1, 1, 2, 5, 5, 5]
        // B = [2, 4, 5]
        //listA = [1, 1, 5, 5]

        for(int key : mapA.keySet()) {
            int countA = mapA.get(key);
            if(mapB.containsKey(key)){
                int countB = mapB.get(key);

                int diff = countA - countB;
                if(diff > 0) {
                    while(diff != 0) {
                        listA.add(key);
                        diff--;
                    }
                }

            } else {
                while(countA != 0){
                    listA.add(key);
                    countA--;
                }
            }
        }

        for(int key : mapB.keySet()) {
            int countB = mapB.get(key);
            if(mapA.containsKey(key)){
                int countA = mapA.get(key);

                int diff = countB - countA;
                if(diff > 0) {
                    while(diff != 0) {
                        listB.add(key);
                        diff--;
                    }
                }

            } else {
                while(countB != 0){
                    listB.add(key);
                    countB--;
                }
            }
        }

        result.add(listA);
        result.add(listB);
        return result;

    }

    public static void main(String[] args) {
        ElementDifference elementDiff = new ElementDifference();
        int[] A = new int[] {1, 2, 5, 5, 5};
        int[] B = new int[] {2, 4, 5};

        List<List<Integer>> result = elementDiff.elementDiff(A, B);

        for(List<Integer> list : result) {
            for(Integer num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
