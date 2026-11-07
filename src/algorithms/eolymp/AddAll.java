package algorithms.eolymp;

import java.util.PriorityQueue;

public class AddAll {

    /*
     The cost of adding two numbers is equal to their sum. For example, to add 10 to 1, you need to pay 11.
     The task is to add all the given numbers in such a way as to minimize the total cost.

     For example, adding the numbers 1, 2, and 3 can be done in three ways:
     1+2=3 (cost = 3), 3+3=6 (cost = 6). Total = 9
     1+3=4 (cost = 4), 2+4=6 (cost = 6). Total = 10
     2+3=5 (cost = 5), 1+5=6 (cost = 6). Total = 11
     The first method is the cheapest.

     Input:
     The first line contains a positive integer n (2 <= n <= 10^5). The second line contains n non-negative
     integers, each not exceeding 10^5.

     Output:
     Print the minimum cost of adding all the numbers.

     Example:
     Input:
     3
     1 2 3
     Output:
     9
     */

    public static void main(String[] args) {
        long[] numbers = {1, 2, 3};
        System.out.println(getMinCost(numbers));
    }

    public static long getMinCost(long[] numbers) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (long number : numbers) {
            pq.add(number);
        }
        long cost = 0;
        while (pq.size() > 1) {
            long a = pq.poll();
            long b = pq.poll();
            long sum = a + b;
            cost += sum;
            pq.add(sum);
        }
        return cost;
    }
}
