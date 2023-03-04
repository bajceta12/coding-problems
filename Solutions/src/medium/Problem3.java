package medium;

import java.util.Arrays;

public class Problem3 {
    // Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the K-th
    // smallest element in the given array. It is given that all array elements are distinct.

    // Input:
    // N = 6
    // arr[] = 7 10 4 3 20 15
    // K = 3
    // Output : 7
    // Explanation :
    // 3rd smallest element in the given
    // array is 7.

    public static void main(String[] args) {
        // 1 6 2  3 9 2 -2 4 -5

        // 6 5 2   1 -3 4 2 11 9 -4
        //       |
        // sol: 6
        // next: 5
        // nadjem maximum i minimum od [0 - k)

        // onda idem od [k + arr.length)
        //
    }

    public static int kthSmallestBrute(int[] arr, int k) {
        if (k > arr.length) throw new IllegalArgumentException();
        for (int i = 0; i < arr.length; i++) {
            int smaller = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    smaller++;
                }
            }
            if (smaller == k - 1) {
                return arr[i];
            }
        }

        return -1;
    }

    public static int kthSmallestSort(int[] arr, int k) {
        if (k > arr.length) throw new IllegalArgumentException();
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
