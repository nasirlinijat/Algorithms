package algorithms.eolymp;

public class Profit {

    /*
     The cows have opened a new business that operates for n (1 <= n <= 10^5) days.
     On each i-th day, the cows record their net profit P[i] (-1000 <= P[i] <= 1000).

     Find the maximum profit that the cows have obtained during any consecutive period of time
     (a consecutive period can have a length from one day to n days).

     Input:
     The first line contains an integer n. Each of the next n lines contains one integer P[i].

     Output:
     Print the value of the maximum profit obtained during any consecutive period.

     Example:
     Input:
     7
     -3
     4
     9
     -2
     -5
     8
     -3
     Output:
     14
     */

    public static void main(String[] args) {
        int[] profit = {-3, 4, 9, -2, -5, 8, -3};
        System.out.println(getMaxProfit(profit));
    }

    public static long getMaxProfit(int[] profit) {
        long cur = 0;
        long best = Long.MIN_VALUE;
        for (int x : profit) {
            cur = Math.max(x, cur + x);
            best = Math.max(best, cur);
        }
        return best;
    }
}
