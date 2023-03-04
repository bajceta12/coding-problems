package easy;

import java.util.ArrayList;
import java.util.Collections;

public class Problem7 {
    // Given an array A of positive integers. Your task is to find the leaders in the array.
    // An element of array is leader if it is greater than or equal to all the elements to its right side.
    // The rightmost element is always a leader.
    public static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> leaders = new ArrayList<>();
        int rightMax = arr[--n];
        leaders.add(rightMax);

        while (--n >= 0) {
            if (arr[n] >= rightMax) {
                rightMax = arr[n];
                leaders.add(rightMax);
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }
}
