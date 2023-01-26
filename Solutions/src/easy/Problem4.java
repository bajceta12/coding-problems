package easy;

public class Problem4 {
    // Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N.
    // Find the missing element.
    static int missingNumber(int[] array, int n) {
        int expectedSum = (n + 1) * n / 2;
        int actualSum = 0;
        for (int num : array) actualSum += num;
        return expectedSum - actualSum;
    }
}
