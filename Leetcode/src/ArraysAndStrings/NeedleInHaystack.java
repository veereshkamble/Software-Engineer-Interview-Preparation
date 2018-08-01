package ArraysAndStrings;

public class NeedleInHaystack {

    public int needleInHaystack(String haystack, String needle) {
        if(needle.length() == 0) {
            return 0;
        }

        if(haystack.length() < needle.length()) {
            return -1;
        }

        if(haystack.length() == needle.length()) {
            return haystack.compareTo(needle);
        }

        for (int i=0; i<haystack.length(); i++) {
            int hIndex = i;
            int nIndex = 0;

            while(hIndex < haystack.length() && nIndex < needle.length() && haystack.charAt(hIndex) == needle.charAt(nIndex)) {
                hIndex++;
                nIndex++;
            }

            if(nIndex == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        NeedleInHaystack needleInHaystack = new NeedleInHaystack();
        String haystack = "Hello";
        String needle = "Hello";
        System.out.println(needleInHaystack.needleInHaystack(haystack, needle));
    }
}
