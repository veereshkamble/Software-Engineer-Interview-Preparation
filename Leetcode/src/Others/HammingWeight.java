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

    public static void main(String[] args) {
        HammingWeight hammingWeight = new HammingWeight();
        System.out.println(hammingWeight.hammingWeight(15));
    }
}
