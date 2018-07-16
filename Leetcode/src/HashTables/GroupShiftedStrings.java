package HashTables;
import java.util.*;

public class GroupShiftedStrings {
    public List<List<String>> groupStrings(String[] strings) {
        if(strings == null || strings.length == 0) {
            return new ArrayList<List<String>>();
        }

        HashMap<Integer, List<String>> hashMap = new HashMap<Integer, List<String>>();

        for(String s : strings) {
            char[] str = s.toCharArray();
            int keyString = str.length;

            if(!hashMap.containsKey(keyString)) {
                hashMap.put(keyString, new ArrayList<String>());
            }

            hashMap.get(keyString).add(s);

        }
        return new ArrayList<List<String>>(hashMap.values());
    }
}
