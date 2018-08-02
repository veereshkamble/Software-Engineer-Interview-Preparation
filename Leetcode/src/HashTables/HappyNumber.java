package HashTables;

public class HappyNumber {
    public boolean isHappy(int n) {
        int count = 0;
        while (true) {
            int k = n;
            int sum = 0;
            while(n != 0) {
                k = n % 10;
                sum = sum + k*k;
                n = n / 10;
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

    public static void main(String[] args) {
        int n = 17;
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(n));
    }
}
