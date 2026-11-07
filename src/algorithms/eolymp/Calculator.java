package algorithms.eolymp;

public class Calculator {

    /*
     Ilya's calculator performs two actions: multiplies the current number by three and adds one to it.
     The calculator now shows the number 1. Help Ilya to determine the smallest number of operations,
     after which he will get the number n.

     Input:
     One integer n (10 <= n <= 10^9).

     Output:
     Print the minimum number of operations.

     Example:
     Input:
     1447
     Output:
     16
     */

    public static void main(String[] args) {
        long n = 1447;
        System.out.println(getMinOperations(n));
    }

    public static int getMinOperations(long n) {
        int count = 0;
        while (n != 1) {
            if (n % 3 != 0) n -= 1;
            else n /= 3;
            count++;
        }
        return count;
    }
}
