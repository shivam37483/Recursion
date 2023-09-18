package recursion;

import java.util.*;

public class one {
    public static void some(int n) {
        if (n > 239089980) {
            System.out.println("Stop: " + n);
        } else {
            some(n * n);
            System.out.println(n);
        }
    }

    public static int powerOf(int n) {
        if (n == 0) {
            return 1;
        } else {
            var power = 2 * powerOf(n - 1);
            return power;
        }
    }

    public int factorial(int num) {
        // TODO
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public int fib(int n) {
        // TODO
        if (n ==0 || n==1) {
            return n;
        } else {
            return n + fib(n -1);
        }
      }

    public static int sum(int a) {
        if (a < 10) {
            return a;
        } else {
            return a % 10 + sum(a / 10);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, b % a);
        }
    }

    public int power(int base, int exponent) {
        // TODO
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static int productofArray(int A[], int N) {
        // TODO
        if (N == 0) {
            return 1;
        } else {
            return (A[N -1] * productofArray(A, N-1));
        }
    }

    public int recursiveRange(int num) {
        //  TODO
        if (num == 1) {
            return 1;
        } else {
            return (num + recursiveRange(num -1));
        }
    }    

    public static void main(String[] args) {
        // some(7);

        // System.out.println(powerOf(68));
        // System.out.println(fact(4));
        // System.out.println(fibu(3));

        // System.out.println(sum(10));
        // System.out.println(gcd(8, 4));
        int[] arr = {2,2,2,2,2};

        System.out.println(productofArray(arr,5));
    }
}
