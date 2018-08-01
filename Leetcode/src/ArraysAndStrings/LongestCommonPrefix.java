package ArraysAndStrings;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        if(strs.length == 1) {
            return strs[0];
        }

        int minLen = Integer.MAX_VALUE;

        for(String str : strs) {
            if (minLen > str.length())
                minLen = str.length();
        }

        for(int i=0; i<minLen; i++) {
            for(int j=0; j<strs.length - 1; j++) {
                String s1 = strs[j];
                String s2 = strs[j+1];
                if(s1.charAt(i) != s2.charAt(i)){
                    return s1.substring(0, i);
                }
            }
        }
        return strs[0].substring(0, minLen);
    }

    public static void main(String [] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = new String[] {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
    }
}
