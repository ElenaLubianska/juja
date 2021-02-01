package ua.com.juja.core;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(fibon(10));
    }

    private static long fibon(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];

    }
    /*
    public static void main(String[] args) {
        int[] array = {-1000};
        int[] expected = {};
        int[] actual = ArrayUtils.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError(Arrays.toString(actual));
        }

        System.out.print("OK");
        System.out.println(Arrays.toString(array));
    }/*
    public static void main(String[] args) {
        int[] array = {-10, 1, 1, 1};
        int[] expected = {1, 3};
        int[] actual = ArrayUtils.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }*/

}


