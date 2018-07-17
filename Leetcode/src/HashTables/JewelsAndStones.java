package HashTables;
import java.util.*;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();
        int count = 0;
        HashSet<Character> hashSet = new HashSet<Character>();

        for(int i = 0; i < jewels.length; i++) {
            hashSet.add(jewels[i]);
        }

        for(int i = 0; i < stones.length; i++) {
            if(hashSet.contains(stones[i])) {
                count++;
            }
        }
        return count;
    }
}
