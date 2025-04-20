package _016_ARRAYS_Part_II;
// Time Complexity = O(n)
public class _04_Buy_Sell_Stocks {
    public static int buyAndSellStocks(int[] price){
        int buyPrice = Integer.MAX_VALUE; // we need minimum value of buying price, so we had use of Integer.MAX_VALUE, it will give the smallest value of buying price
        int maxProfit = 0;

        for(int i=0; i<price.length; i++){
            if(buyPrice <price[i]){ // profit
                int profit = price[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(price));
    }
}
/*
Output:
5
 */

/*
Notes:
buy in low price and sell in high price -- profit
profit = sellingPrice - buyPrice
 */