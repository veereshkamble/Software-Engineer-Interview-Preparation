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

    public boolean isOneEditInsert(String string1, String string2) {
        int index1 = 0;
        int index2 = 0;

        while(index1 < string1.length() && index2 < string2.length()) {
            if(string1.charAt(index1) != string2.charAt(index2)) {
                if(index1 != index2) {
                    return false;
                }
                index1++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String string1 = "bale";
        String string2 = "baaale";
        OneEditDistance oneEditDistance = new OneEditDistance();
        System.out.println(oneEditDistance.isOneEditDistance(string1, string2));
    }
}
