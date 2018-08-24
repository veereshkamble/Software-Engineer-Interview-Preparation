package ArraysAndStrings;

public class ShortestPalindrome {

    public String shortestPalindrome(String s) {
        String temp = s + "#" + new StringBuilder(s).reverse().toString();
        int[] table = getPrefixTable(temp);

        //get the maximum palin part in s starts from 0
        return new StringBuilder(s.substring(table[table.length - 1])).reverse().toString() + s;
    }

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

    public static void main(String[] args) {
        ShortestPalindrome shortestPalindrome = new ShortestPalindrome();
        System.out.println(shortestPalindrome.shortestPalindrome("aacecaaa"));
    }

}
