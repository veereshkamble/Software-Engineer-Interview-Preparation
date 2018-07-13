package HashTables;
import java.util.HashSet;
import java.util.Set

public class HashSetUsage {
    public static void main(String[] args) {
        // 1. Initialize the hash set
        Set<Integer> hashSet = new HashSet<>();

        // 2. Add new keys
        hashSet.add(7);
        hashSet.add(10);
        hashSet.add(9);

        // 3. remove keys
        hashSet.remove(7);

        // 4. Check if a key is present in the Hash Set
        if( !hashSet.contains(2)) {
            System.out.println("Key 2 is not in the Has Set");
        }

        // 5. get the size of the Hash Set
        System.out.println("The size of the hash set is : " + hashSet.size());

        // 6. Iterate the Hash Set
        for (Integer i : hashSet) {
            System.out.print(i + " ");
        }

        // 7. 
    }
}
