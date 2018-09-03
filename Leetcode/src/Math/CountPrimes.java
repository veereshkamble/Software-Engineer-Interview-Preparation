package Math;

public class CountPrimes {

    public int countPrimes(int n) {

        if(n == 0) {
            return 0;
        }



        int count = 0;
        for(int i = 1; i <= n; i++) {
            boolean isPrime = true;

            for(int j = 2; j <= i/2; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count++;
            }
        }
        return count;
    }
}
