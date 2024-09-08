import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class BuySellStocks{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int cost=prices.get(0);
        int profit=0;

        for(int i=1;i<prices.size();i++){
            int currprofit=prices.get(i)-cost;
            profit=Math.max(profit,currprofit);
            cost=Math.min(prices.get(i),cost);
        }

        return profit;
    }
}