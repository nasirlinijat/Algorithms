package algorithms.eolymp;

import java.util.Arrays;

public class SaucepansAndLids {

    /*
     After the cabinet fell, some saucepans and lids were thrown away.
     Find out how many remaining saucepans can be covered by the remaining lids.
     The saucepans and lids are round. A lid can cover a saucepan only if its radius is not less than
     the radius of the saucepan.

     Input:
     The first line contains integers n, m (1 <= n, m <= 1000) - the number of remaining saucepans and lids.
     The second line contains n integers a[i] (1 <= a[i] <= 1000) - the radii of the saucepans.
     The third line contains m integers b[i] (1 <= b[i] <= 1000) - the radii of the lids.

     Output:
     Print one number - the largest number of saucepans that can be covered by the available lids.

     Example:
     Input:
     5 5
     4 8 1 2 5
     7 2 4 6 5
     Output:
     4
     */

    public static void main(String[] args) {
        int[] a = {4, 8, 1, 2, 5};
        int[] b = {7, 2, 4, 6, 5};
        System.out.println(getMaxCovered(a, b));
    }

    public static int getMaxCovered(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int count = 0;
        int ai = a.length - 1;
        int bi = b.length - 1;
        while (ai >= 0 && bi >= 0) {
            if (b[bi] >= a[ai]) {
                count++;
                ai--;
                bi--;
            } else {
                ai--;
            }
        }
        return count;
    }
}
