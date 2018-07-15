package HashTables;
import java.util.*;

public class FIndRestaturant {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new LinkedList<>();
        int minSum = Integer.MAX_VALUE;
        for (int i=0;i<list1.length;i++) map.put(list1[i], i);
        for (int i=0;i<list2.length;i++) {
            Integer j = map.get(list2[i]);
            if (j != null && i + j <= minSum) {
                if (i + j < minSum) { res.clear(); minSum = i+j; }
                res.add(list2[i]);
            }
        }
        return res.toArray(new String[res.size()]);
    }

    public static void main(String[] args) {
        String[] string1 = new String[] {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] string2 = new String[] {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};

        FIndRestaturant fIndRestaturant = new FIndRestaturant();
        String result[] = fIndRestaturant.findRestaurant(string1, string2);

        for(int i = 0 ; i < result.length; i++ ){
            System.out.println(result[i]);
        }

    }
}
