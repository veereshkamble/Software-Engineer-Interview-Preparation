package HashTables;

public class HappyNumber {
    public boolean isHappy(int n) {
        int count = 0;
        while (true) {
            int k = n;
            int sum = 0;
            while(k != 0) {
                k = k % 10;
                sum = sum + k^2;
                k = k / 10;
            }
            if (sum == 1) {
                return true;
            }
            count++;
            if(count >= 10) {
                break;
            }
            n = sum;

        }
        return false;
    }
}
