package leetcode_easy;

public class StockBuySell {
    public static int mostProfit(int[] prices){
        int buyPrice = prices[0], profit = 0;
        for(int price: prices){
            buyPrice = Math.min(buyPrice, price);
            profit = Math.max(profit, price - buyPrice);
        }
        return profit;
    }
    public static void main(String[] args) {
        System.out.println(mostProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(mostProfit(new int[]{7, 1, 2, 3, 4}));
        System.out.println(mostProfit(new int[]{5, 4, 3, 2, 1}));
        System.out.println(mostProfit(new int[]{0, 0, 1, 2, 3, 4}));
    }
}
