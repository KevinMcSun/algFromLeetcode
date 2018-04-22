package org.ks.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start < o2.start)
                    return -1;
                else if (o1.start == o2.start)
                    return 0;
                else
                    return 1;
            }
        });

        for (int i = 0; i < intervals.size() - 1;) {
            if (intervals.get(i).start == intervals.get(i + 1).start && intervals.get(i + 1).end == intervals.get(i).end) {
                // [[1, 4], [1, 4]]
                intervals.remove(i + 1);
            } else if (intervals.get(i).end >= intervals.get(i + 1).end) {
                // [[1, 4], [1, 3]]
                intervals.remove(i + 1);
            } else if (intervals.get(i).end >= intervals.get(i + 1).start && intervals.get(i).end <= intervals.get(i + 1).end) {
                // [[1, 4], [1, 5]]
                intervals.get(i).end = intervals.get(i + 1).end;
                intervals.remove(i + 1);
            }else {
                i++;
                continue;
            }
        }

        return intervals;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));
        System.out.println(merge(intervals));

        return;
    }
}
