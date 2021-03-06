package InterviewProcess;

import java.util.TreeSet;

public class KEmtpySlots {

    public int kEmptySlots(int[] flowers, int k) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < flowers.length; i++) {
            int xc = flowers[i], xl = xc - (k + 1), xr = xc + (k + 1);

            Integer l = set.lower(xc);
            if (l != null && l == xl) return i + 1;

            Integer r = set.higher(xc);
            if (r != null && r == xr) return i + 1;

            set.add(xc);
        }

        return -1;
    }

    public static void main(String[] args) {
        KEmtpySlots kEmtpySlots = new KEmtpySlots();
        int[] flowers = new int[] {1, 3, 2, 7};
        int k = 3;
        System.out.println(kEmtpySlots.kEmptySlots(flowers, k));
    }
}
