package medium;

import java.util.Arrays;

public class Problem2 {
    // Given an array of N integers arr[] where each element represents the maximum length of the jump that can
    // be made forward from that element.
    // This means if arr[i] = x, then we can jump any distance y such that y ≤ x.
    // Find the minimum number of jumps to reach the end of the array (starting from the first element).
    // If an element is 0, then you cannot move through that element.

    static int minJumps2(int[] arr) {
        if (arr.length == 0 || arr[0] == 0) return -1;

        int i, jumps, lastIndex, leap, nextLeap;
        lastIndex = arr.length - 1;
        i = jumps = 0;
        leap = nextLeap = arr[0];

        while (i < lastIndex) {
            if (leap >= lastIndex)
                return ++jumps;

            while (i < leap) {
                if (arr[++i] + i > nextLeap)
                    nextLeap = arr[i] + i;
            }

            if (nextLeap == leap)
                return -1;
            leap = nextLeap;
            jumps++;
        }
        return -1;
    }

    //    static int minJumps1(int[] arr) {
//        if (arr[0] == 0) return -1;
//        int[] jumps = new int[arr.length];
//        Arrays.fill(jumps, arr.length);
//        jumps[0] = 0;
//
//        int i = 0;
//        int lastIndex = arr.length - 1;
//        while (i < lastIndex) {
//            int leap = i + arr[i];
//
//            if (leap >= lastIndex) {
//                return jumps[i] + 1;
//            }
//
//            while (leap > i && jumps[leap] > jumps[i] + 1) {
//                jumps[leap--] = jumps[i] + 1;
//            }
//
//            i++;
//            if(arr[i] == arr.length)
//                return -1;
//        }
//        return -1;
//    }
}