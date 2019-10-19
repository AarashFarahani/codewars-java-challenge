package cw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class Interval
{
    public static int sumIntervals(int[][] intervals) {
        return intervals == null ? 0 : (int) Arrays.stream(intervals)
                .flatMapToInt(interval -> IntStream.range(interval[0], interval[1]))
                .distinct()
                .count();

//        Set<Integer> set = new HashSet<>();
//
//        if (intervals != null) {
//            for (int i = 0; i < intervals.length; i++) {
//                for (int j = intervals[i][0]; j < intervals[i][1]; j++)
//                    set.add(j);
//            }
//        }
//
//        return set.size();
    }
}
