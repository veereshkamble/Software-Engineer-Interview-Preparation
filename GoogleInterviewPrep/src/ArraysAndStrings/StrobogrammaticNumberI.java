package ArraysAndStrings;

public class StrobogrammaticNumberI {

    public boolean isStrobogrammatic_map(String num) {
        int i = 0;
        int j = num.length() - 1;
        Map<Character, Character> map = new HashMap();
        map.put('8', '8');
        map.put('1', '1');
        map.put('0', '0');
        if (j == 0) {
            return map.containsKey(num.charAt(i));
        }

        map.put('9', '6');
        map.put('6', '9');
        while (i < j) {
            if (!map.containsKey(num.charAt(i)) || !map.containsKey(num.charAt(j))) {
                return false;
            }
            if (map.get(num.charAt(i)) != num.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return map.containsKey(num.charAt(i));
    }


    
}
