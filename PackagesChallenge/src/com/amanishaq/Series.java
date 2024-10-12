package com.amanishaq;

public class Series {

    public static int nSum(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 0;
        }

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static long fibonacci(int n) {
        // declare an array to store fibonacci numbers.
        int f[] = new int[n + 2]; // 1 Extra to handle case, n = 0.
        // 0th and 1st number of the series are 0 and 1.
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            // Add the previous two numbers in the series and store it.
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}
