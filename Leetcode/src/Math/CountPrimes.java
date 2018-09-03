package Math;

public class CountPrimes {

    public int countPrimes(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int k) {
        if (k <= 1) {
            return false;
        }
        for (int i = 2; i * i <= k; i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int n = 10;
        CountPrimes countPrimes = new CountPrimes();
        System.out.println(countPrimes.countPrimes(n));
    }
}
