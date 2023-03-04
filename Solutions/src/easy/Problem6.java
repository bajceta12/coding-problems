package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Problem6 {
    //The cost of stock on each day is given in an array A[] of size N. Find all the segments of days on which you buy
    // and sell the stock so that in between those days your profit is maximum.
    //
    //Note: Since there can be multiple solutions, the driver code will print 1 if your answer is correct, otherwise,
    // it will return 0.
    // In case there's no profit the driver code will print the string "No Profit" for a correct solution.
    //
    //Example 1:
    //
    //Input:
    //N = 7
    //A[] = {100,180,260,310,40,535,695}
    //Output:
    //1
    //Explanation:
    //One possible solution is (0 3) (4 6)
    //We can buy stock on day 0,
    //and sell it on 3rd day, which will
    //give us maximum profit. Now, we buy
    //stock on day 4 and sell it on day 6.
    public static ArrayList<ArrayList<Integer>> stockBuySell(int[] prices, int n) {
        ArrayList<ArrayList<Integer>> buySellPairs = new ArrayList<>();
        int currDay, buyDay, sellDay;
        boolean bought = false;
        currDay = buyDay = sellDay = 0;
        while (++currDay < n) {
            if (!bought) {
                if (prices[currDay] <= prices[buyDay]) {
                    buyDay = currDay;
                } else {
                    bought = true;
                    sellDay = currDay;
                }
            } else {
                if (prices[currDay] >= prices[sellDay]) {
                    sellDay = currDay;
                }
                else {
                    bought = false;
                    ArrayList<Integer> currPair = new ArrayList<>();
                    currPair.add(buyDay);
                    currPair.add(sellDay);
                    buySellPairs.add(currPair);
                    buyDay = currDay;
                }
            }
        }
        if (bought && prices[sellDay] > prices[buyDay]) {
            ArrayList<Integer> currPair = new ArrayList<>();
            currPair.add(buyDay);
            currPair.add(sellDay);
            buySellPairs.add(currPair);
        }
        return buySellPairs;
    }

    public static void test() {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(stockBuySell(arr, arr.length));
    }

    public static void main(String[] args) {
        test();
    }
}
