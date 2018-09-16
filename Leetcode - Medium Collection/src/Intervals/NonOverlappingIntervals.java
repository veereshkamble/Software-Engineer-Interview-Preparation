package Intervals;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {

    class myComparator implements Comparator<Interval> {
        public int compare(Interval a, Interval b) {
            return a.start - b.start;
        }
    }
    public int eraseOverlapIntervalsRecursive(Interval[] intervals) {
        Arrays.sort(intervals, new myComparator());
        return erase_Overlap_Intervals(-1, 0, intervals);
    }
    public int erase_Overlap_Intervals(int prev, int curr, Interval[] intervals) {
        if (curr == intervals.length) {
            return 0;
        }
        int taken = Integer.MAX_VALUE, nottaken;
        if (prev == -1 || intervals[prev].end <= intervals[curr].start) {
            taken = erase_Overlap_Intervals(curr, curr + 1, intervals);
        }
        nottaken = erase_Overlap_Intervals(prev, curr + 1, intervals) + 1;
        return Math.min(taken, nottaken);
    }
}
