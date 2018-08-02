package HashTables;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class FindDuplicates {

    public boolean findDuplicates(List<Integer> keys) {
        Set<Integer> hashSet = new HashSet<>();
        for(Integer key : keys) {
            if(hashSet.contains(key)) {
                return true;
            }
            hashSet.add(key);
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> keys = new ArrayList<Integer>();
        keys.add(1);
        keys.add(3);
        keys.add(3);

        FindDuplicates findDuplicates = new FindDuplicates();
        System.out.println(findDuplicates.findDuplicates(keys));
    }
}
