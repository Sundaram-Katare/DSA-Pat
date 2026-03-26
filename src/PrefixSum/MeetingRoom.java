package PrefixSum;

import java.util.Arrays;

public class MeetingRoom {
    public static boolean canAttend(int[][] intervals) {
        for (int i=0; i<intervals.length; i++) {
            for (int j=i+1; j<intervals.length; j++){
                if (isOverlap(intervals[i], intervals[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isOverlap(int[] interval1, int[] interval2) {
        int startLater = Math.max(interval1[0], interval2[0]);
        int endEarlier = Math.min(interval1[1], interval2[1]);

        if (endEarlier > startLater) {
            return true;
        }
        return false;
    }

    public static boolean canAttendOptimal(int[][] intervals) {
        if (intervals == null || intervals.length == 1) {
            return true;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i=1; i<intervals.length; i++) {
            if (intervals[i][0] < intervals[i-1][1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] intervals = {{7,9}, {6,11}};

        System.out.println(canAttend(intervals));

        System.out.println(canAttendOptimal(intervals));
    }
}
