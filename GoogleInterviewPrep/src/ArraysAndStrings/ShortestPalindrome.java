package ArraysAndStrings;

public class ShortestPalindrome {

    public int[] getPrefixTable(String s) {
        int i = 1, j = 0;
        int n = s.length();
        int[] table = new int[s.length()];

        while(i < n) {
            if(s.charAt(i) == s.charAt(j)) {
                table[i] = j + 1;
                i++;
                j++;
            } else if(j > 0) {
                j = table[j-1];
            } else {
                table[i] = 0;
                i++;
            }
        }
        return table;
    }
    
}
