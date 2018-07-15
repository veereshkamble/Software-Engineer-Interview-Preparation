package HashTables;
import java.util.*;

public class HashMapUsage {
    public static void main(String[] args) {
        // 1. Initialize a Hash Map
        Map<Integer, Integer> hashMap = new HashMap<>();

        // 2. insert a new (key, value) pair
        hashMap.putIfAbsent(0,0);
        hashMap.putIfAbsent(2,2);

        // 3. insert a new (key, value) pair or update the value of existing key
        hashMap.put(1,3);
        hashMap.put(1,1);

        //4. get the value of a specific key
        System.out.println("The value of key 1 is : " +hashMap.get(1));

        //5. delete a key
        hashMap.remove(2);

        // 6. check if a key is in the hash map
        if(hashMap.containsKey(2)){
            System.out.println("Key 2 is not in the hash map");
        }
        
    }
}
