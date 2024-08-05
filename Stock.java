public class Stock {
    public static int buyAndSell(int prices[]){
        int buyPrice = Integer.MAX_VALUE;//+infinity can store in this 
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice; // today's profit
               System.out.println( i+" - Profit of today :"+profit);
                maxProfit = Math.max(maxProfit , profit);
            }
            else{
                buyPrice = prices[i];
                }
        }
        return maxProfit;
    } 
    public static void main(String args[]){
        int prices[] = {7 , 1 , 5 , 3 , 6 , 4};
        
        System.out.println("Maximum profit is : " + buyAndSell(prices));
    }
    
}
