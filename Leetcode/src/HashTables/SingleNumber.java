package HashTables;

import java.util.*;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        int key = 0;

        for (int num : nums) {
            if(hashSet.contains(num)) {
                hashSet.remove(num);
            }
            hashSet.add(num);
        }

        for(Integer i : hashSet) {
            key = i;
        }
        return key;
    }

}

