package ArraysAndStrings;

public class ReverseWordsInAString {

    public String reverseWords(String s) {
        if (s == null) return null;

        char[] str = s.toCharArray();
        int len = str.length;

        //step 1. reverse the whole string
        reverse(str, 0, len-1);

        //step2. reverse each word
        reverseWords(str, len);

        //step3. cleanup spaces
        return cleanSpaces(str, len);
    }

    public void reverse(char[] str, int i, int j) {
        while(i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }

    public void reverseWords(char[] str, int len) {
        int i = 0, j = 0;

        while(i < len) {
            while(i < j || i < len && str[i] == ' ') i++; // skip spaces
            while(j < i || j < len && str[j] != ' ') j++; //skip non spaces
            reverse(str, i, j-1);                      //reverse the word
        }
    }

    // trim leading, trailing and multiple spaces
    String cleanSpaces(char[] a, int n) {
        int i = 0, j = 0;

        while (j < n) {
            while (j < n && a[j] == ' ') j++;             // skip spaces
            while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
            while (j < n && a[j] == ' ') j++;             // skip spaces
            if (j < n) a[i++] = ' ';                      // keep only one space
        }

        return new String(a).substring(0, i);
    }

    public static void main(String[] args) {
        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
        String s = "Veeresh Jamila";
        System.out.println(reverseWordsInAString.reverseWords(s));
    }
}
