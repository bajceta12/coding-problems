package medium;

public class Problem1 {
    // Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number)
    // which has the maximum sum and return its sum.

    static long maxSubarraySum(int[] arr, int n){
        int maxSum=arr[0];
        int curSum=0;

        for (int i = 1; i < n; i++) {
            curSum = curSum + arr[i];
            if(curSum > maxSum){
                maxSum = curSum;
            }
            if(curSum < 0){
                curSum = 0;
            }
        }

        return maxSum;
    }
}
