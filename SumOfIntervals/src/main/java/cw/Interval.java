package cw;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class Interval
{
    public static int sumIntervals(int[][] intervals) {
        Set<Integer> set = new HashSet<>();

        if (intervals != null) {
            for (int i = 0; i < intervals.length; i++) {
                for (int j = intervals[i][0]; j < intervals[i][1]; j++) {
                    set.add(j);
                }
            }
        }

        return set.size();
    }
}
