package HashTables;
import java.util.*;

public class GroupShiftedStringsLeetCode {

    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> result = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strings) {
            int offset = str.charAt(0) - 'a';
            String key = "";
            for (int i = 0; i < str.length(); i++) {
                char c = (char) (str.charAt(i) - offset);
                if (c < 'a') {
                    c += 26;
                }
                key += c;
            }
            if (!map.containsKey(key)) {
                List<String> list = new ArrayList<String>();
                map.put(key, list);
            }
            map.get(key).add(str);
        }
        for (String key : map.keySet()) {
            List<String> list = map.get(key);
            Collections.sort(list);
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] str = new String[] {"abc", "bcd", "cfs", "acef", "xyz", "az", "ba", "a", "z", "dgt"};
        List<List<String>> strings = new ArrayList<List<String>>();
        GroupShiftedStringsLeetCode groupShiftedStrings = new GroupShiftedStringsLeetCode();

        strings = groupShiftedStrings.groupStrings(str);

        for(List<String> strs : strings) {
            for(String s : strs) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
