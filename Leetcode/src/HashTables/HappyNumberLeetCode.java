package HashTables;
import java.util.*;

public class HappyNumberLeetCode {
    public boolean isHappy(int n) {
        Set<Integer> inLoop = new HashSet<Integer>();
        int squareSum, remain;
        while (inLoop.add(n)) {
            squareSum = 0;
            while (n > 0) {
                remain = n%10;
                squareSum += remain*remain;
                n /= 10;
        }
        if (squareSum == 1)
            return true;
            else
                n = squareSum;

        }
        return false;

    }

    public static void main(String[] args) {
        int n = 23;
        HappyNumberLeetCode happyNumberLeetCode = new HappyNumberLeetCode();
        System.out.println(happyNumberLeetCode.isHappy(n));
    }
}
