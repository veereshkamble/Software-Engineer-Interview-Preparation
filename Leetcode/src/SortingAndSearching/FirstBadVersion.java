package SortingAndSearching;

public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end-start) / 2;
            if (!isBadVersion(mid))  {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }

    public boolean isBadVersion(int n) {
        return n == 0;
    }
}
