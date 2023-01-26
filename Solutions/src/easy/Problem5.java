package easy;

import java.util.Arrays;

public class Problem5 {
    // Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

    public static void sort012(int[] a, int n)
    {
        int zeros, ones;
        zeros = ones = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) zeros++;
            else if (a[i] == 1) ones++;
        }
        ones += zeros;
        int index = 0;
        while (index < zeros) a[index++] = 0;
        while (index < ones) a[index++] = 1;
        while (index < n) a[index++] = 2;
    }
}
