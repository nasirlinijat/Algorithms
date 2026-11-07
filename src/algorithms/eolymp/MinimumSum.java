package algorithms.eolymp;

import java.util.Arrays;

public class MinimumSum {

    /*
     There are two arrays of positive integers a[1..n] and b[1..n].
     Find a permutation i1, i2, ..., in of numbers 1, 2, ..., n, for which the sum
     a1 * b[i1] + ... + an * b[in] is minimal. Each number should appear only once in the permutation.

     Input:
     The first line contains the number of elements n (n <= 100) in the arrays.
     The second line contains the elements of the first array, and the third line contains the elements of the second array.
     The array elements do not exceed 10^6.

     Output:
     Print the minimal value of required sum.

     Example:
     Input:
     5
     7 2 4 3 10
     5 11 6 9 6
     Output:
     165
     */

    public static void main(String[] args) {
        int[] a = {7, 2, 4, 3, 10};
        int[] b = {5, 11, 6, 9, 6};
        System.out.println(getMinSum(a, b));
    }

    public static long getMinSum(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int n = a.length;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (long) a[i] * b[n - i - 1];
        }
        return sum;
    }
}
