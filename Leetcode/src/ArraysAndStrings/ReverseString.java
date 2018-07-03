package ArraysAndStrings;

public class ReverseString {

    public String reverseString(String s) {
        char[] str = s.toCharArray();
        int i = 0, j = str.length - 1;

        while(i<j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return new String(str);
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String s = "Hello";
        System.out.println(reverseString.reverseString(s));
    }
}
