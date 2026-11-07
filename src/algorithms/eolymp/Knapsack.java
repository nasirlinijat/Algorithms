package algorithms.eolymp;

import java.util.Arrays;

public class Knapsack {

    /*
     Vasya is planning to go hiking with fellow programmers and has decided to take a responsible approach
     in choosing what to bring. Vasya has n items that he could take in his knapsack. Each item weighs
     1 kilogram, but the items have different "usefulness" values for Vasya.

     The hike is going to be very long, so Vasya would like to carry a knapsack with a weight not exceeding
     w kilograms.

     Help him determine the maximum total "usefulness" of the items in his knapsack if the weight
     of the backpack can be no more than w kilograms.

     Input:
     The first line contains two integers w and n (1 <= w, n <= 20). The second line contains n integers ci
     (1 <= ci <= 1000) - the "usefulness" of each item.

     Output:
     Print the maximal total "usefulness" of the items that Vasya can take with him.

     Example 1:
     Input:
     2 3
     1 5 3
     Output:
     8

     Example 2:
     Input:
     3 2
     3 2
     Output:
     5
     */

    public static void main(String[] args) {
        int w = 2;
        int[] items = {1, 5, 3};
        System.out.println(getMaxUsefulness(w, items));
    }

    public static long getMaxUsefulness(int w, int[] items) {
        int n = items.length;
        Arrays.sort(items);
        long k = 0;
        for (int i = n - 1; i >= n - w && i >= 0; i--) {
            k += items[i];
        }
        return k;
    }
}
