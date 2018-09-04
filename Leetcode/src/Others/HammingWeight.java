package Others;

public class HammingWeight {

    public int hammingWeight(int n) {
        int bits = 0;
        while (n != 0) {
            bits++;
            n &= (n - 1);
        }
        return bits;
    }
}
