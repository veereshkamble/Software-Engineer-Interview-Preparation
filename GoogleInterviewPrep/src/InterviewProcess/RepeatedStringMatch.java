package InterviewProcess;

import java.util.HashSet;
import java.util.Set;

public class RepeatedStringMatch {

    // Check is all characters are there, if then, start building and checking until found, else return -1
    public int repeatedStringMatch(String A, String B) {
        if(!containsAllCharacters(A,B))
            return -1;
        String build = "";
        int count = 0;
        while(build.length() < B.length() * 2)
        {
            build += A;
            count++;
            if(build.contains(B))
                return count;
        }
        return -1;
    }
    // Returns set of character for a given string
    private Set<Character> getSet(String s)
    {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        return set;
    }
    // Check if String A contains all characters in String B
    private boolean containsAllCharacters(String A, String B)
    {
        return getSet(A).containsAll(getSet(B));
    }
}
