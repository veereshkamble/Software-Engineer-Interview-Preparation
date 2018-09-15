package Intervals;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoomsI {

    public boolean canAttendMeetingsSorting(Interval[] intervals) {
        Arrays.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i].end > intervals[i + 1].start) return false;
        }
        return true;
    }

    public boolean canAttendMeetings(Interval[] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (overlap(intervals[i], intervals[j])) return false;
            }
        }
        return true;
    }

    private boolean overlap(Interval i1, Interval i2) {
        return ((i1.start >= i2.start && i1.start < i2.end)
                || (i2.start >= i1.start && i2.start < i1.end));
    }
}
