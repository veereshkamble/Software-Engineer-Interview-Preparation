package ArraysAndStrings;

public class OneEditDistance {

    public boolean isOneEditDistance(String string1, String string2) {
        if(string1.length() == string2.length()) {
            return isOneEditReplace(string1, string2);
        } else if(string1.length() == string2.length() + 1) {
            return isOneEditInsert(string1, string2);
        } else if(string1.length() == string2.length() - 1) {
            return isOneEditInsert(string2, string1);
        }
        return false;
    }

    public boolean isOneEditReplace(String string1, String string2) {
        boolean foundDifference = false;
        for(int i = 0; i < string1.length(); i++) {
            if(string1.charAt(i) != string2.charAt(i)) {
                if(foundDifference) {
                    return false;
                }
            }
        }
        return true;
    }

    
}
