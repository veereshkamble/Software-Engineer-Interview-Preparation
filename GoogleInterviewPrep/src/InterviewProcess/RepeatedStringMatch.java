package InterviewProcess;

import java.util.HashSet;
import java.util.Set;

public class RepeatedStringMatch {

    public int repeatedStringMatch(String A, String B) {

        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (sb.length() < B.length()) {
            sb.append(A);
            count++;
        }
        if(sb.toString().contains(B)) return count;
        if(sb.append(A).toString().contains(B)) return ++count;
        return -1;
    }

    public static void main(String[] args) {
        RepeatedStringMatch repeatedStringMatch = new RepeatedStringMatch();
        System.out.println(repeatedStringMatch.repeatedStringMatch("aaaaaaaaaaaaaaaab", "ba"));
    }
}
