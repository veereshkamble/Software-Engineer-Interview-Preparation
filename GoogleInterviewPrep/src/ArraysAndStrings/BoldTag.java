package ArraysAndStrings;

public class BoldTag {

    public String addBoldTag(String s, String[] dict) {
        boolean[] bold = new boolean[s.length()];
        for (int i = 0, end = 0; i < s.length(); i++) {
            for (String word : dict) {
                if (s.startsWith(word, i)) {
                    end = Math.max(end, i + word.length());
                }
            }
            bold[i] = end > i;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!bold[i]) {
                result.append(s.charAt(i));
                continue;
            }
            int j = i;
            while (j < s.length() && bold[j]) {
                j++;
            }
            result.append("<b>" + s.substring(i, j) + "</b>");
            i = j - 1;
        }

        return result.toString();
    }

    public static void main(String args[]) {
        String s = "abcxyz123";
        String[] dict = new String[] {"abc", "123"};
        BoldTag boldTag = new BoldTag();
        System.out.println(boldTag.addBoldTag(s, dict));
    }
}
