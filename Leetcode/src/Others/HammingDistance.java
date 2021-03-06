package Others;

public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int n = x ^ y;
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        System.out.println(hammingDistance.hammingDistance(4, 5));
    }
}
