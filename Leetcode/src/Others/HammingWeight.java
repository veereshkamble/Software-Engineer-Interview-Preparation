package Others;

import HashTables.HappyNumber;

public class HammingWeight {

    public int hammingWeight(int n) {
        int bits = 0;
        while (n != 0) {
            bits++;
            n &= (n - 1);
        }
        return bits;
    }

    public  int hammingWeight1(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }

    public int hammingWeight2(int n) {
        int bits = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                bits++;
            }
            if (n == 0) {
                return bits;
            }
            /**must use unsigned right shift operator since the problem says this is an unsigned value*/
            n >>>= 1;
        }
        return bits;
    }

    public int hammingWeight3(int n) {
        int bits = 0;
        for (int i = 0; i < 32; i++) {
            bits += n & 1;
            n >>>= 1;
        }
        return bits;
    }

    public static void main(String[] args) {
        HammingWeight hammingWeight = new HammingWeight();
        System.out.println(hammingWeight.hammingWeight(15));
    }
}
