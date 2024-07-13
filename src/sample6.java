import java.util.*;
public class sample6 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; 
            } else {
                int currentProfit = prices[i] - minPrice; 
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit; 
                }
            }
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int[] prices = {17, 4, 2, 7, 11, 6, 14};
        sample6 mp = new sample6();
        int maxProfit = mp.maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }
}
