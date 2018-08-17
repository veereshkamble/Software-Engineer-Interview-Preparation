package ArraysAndStrings;

public class BuyAndSellStockII {

    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i=0; i< prices.length-1; i++) {
            if (prices[i+1]>prices[i]) total += prices[i+1]-prices[i];
        }

        return total;
    }

    public static  void main(String[] args) {
        int[]  prices = new int[] {7, 1, 5, 3, 6, 4};

        BuyAndSellStockII buyAndSellStockII = new BuyAndSellStockII();
        System.out.println(buyAndSellStockII.maxProfit(prices));
    }

}
