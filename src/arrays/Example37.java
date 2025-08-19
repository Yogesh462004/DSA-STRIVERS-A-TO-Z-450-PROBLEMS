package arrays;

public class Example37 {
    public static void main(String[] args) {
        System.out.println(maximumProfit(new int[]{7, 10, 1, 3, 6, 9, 2}));
    }
    public static int maximumProfit(int prices[]) {
        int mini=prices[0];
        int profit=0;
        int cost=0;
        for(int i=1;i<prices.length;i++){
            cost=prices[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,prices[i]);
        }
        return profit;
    }
}
