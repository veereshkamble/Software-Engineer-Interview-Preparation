package HashTables;
import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) {
            return new ArrayList<List<String>>();
        }

        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();

        for(String s : strs) {
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String keyString = new String(str);

            if(hashMap.containsKey(keyString)) {
                hashMap.get(keyString).add(s);
            } else {
                hashMap.put(keyString, new ArrayList<String>());
            }
        }
        return new ArrayList<List<String>>(hashMap.values());
    }
}
