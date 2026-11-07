package algorithms.eolymp;

import java.util.Arrays;

public class Segments {

    /*
     Segments are given on a line. Determine the maximum number of segments that can be selected
     such that no two of them intersect. All segments are open.

     Input:
     The first line contains the number of segments n (1 <= n <= 10^5). Each of the next n lines contains
     two integers, li and ri (1 <= li < ri <= 10^9), representing the starting and ending points
     of the i-th segment.

     Output:
     Print the maximum number of non-intersecting segments.

     Example:
     Input:
     5
     1 4
     3 8
     7 8
     2 5
     4 6
     Output:
     3
     */

    public static void main(String[] args) {
        int[][] segments = {
                {1, 4},
                {3, 8},
                {7, 8},
                {2, 5},
                {4, 6}
        };
        System.out.println(getMaxSegments(segments));
    }

    public static int getMaxSegments(int[][] segments) {
        Arrays.sort(segments, (x, y) -> Integer.compare(x[1], y[1]));

        int count = 0;
        int last = 0;
        for (int[] segment : segments) {
            if (segment[0] >= last) {
                last = segment[1];
                count++;
            }
        }
        return count;
    }
}
