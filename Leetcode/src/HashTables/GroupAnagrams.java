package HashTables;
import java.util.*;


public class GroupAnagrams {
    public ArrayList<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) {
            return new ArrayList<List<String>>();
        }

        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();

        for(String s : strs) {
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String keyString = new String(str);

            if(!hashMap.containsKey(keyString)) {
                hashMap.put(keyString, new ArrayList<String>());
            }

            hashMap.get(keyString).add(s);

        }
        return new ArrayList<List<String>>(hashMap.values());
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"eat", "tea", "tan", "ate", "nat", "bat" };
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        ArrayList<List<String>> strings = new ArrayList<List<String>>();
        strings = groupAnagrams.groupAnagrams(strs);

        for(List<String> str : strings) {
           for(String s : str) {
               System.out.print(s + " ");
           }
           System.out.println();
        }

    }
}
