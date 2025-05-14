package Questions_Practice;
// Best Time to Buy and Sell Stock Leetcode
//Time Complexity = O(n)

public class _024_Buy_sell_Stock {
    public static int stock(int[] arr){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0; // When there is no profit

        for(int i=0; i<arr.length; i++){
            if(buyPrice < arr[i]){
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int[] arr1 = {7,6,4,3,1};
        System.out.println(stock(arr));
        System.out.println(stock(arr1));
    }
}
/*
Output:
5
0
 */