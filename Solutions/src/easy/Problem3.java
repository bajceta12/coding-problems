package easy;

import java.util.HashMap;

public class Problem3 {
    // Given an array having both positive and negative integers.
    // The task is to compute the length of the largest subarray with sum 0.

    static int maxLen(int[] arr, int n)
    {
        HashMap<Integer, Integer> startToEnd = new HashMap<>();
        startToEnd.put(0, -1);

        int maxLen = 0;
        int incrSum = 0;
        for (int i = 0; i < n; i++) {
            incrSum += arr[i];
            if (startToEnd.get(incrSum) == null)
                startToEnd.put(incrSum, i);
            else
                maxLen = Math.max(maxLen, i - startToEnd.get(incrSum));
        }

        return maxLen;
    }
}
