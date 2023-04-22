class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int output=0;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<max){
                max=prices[i];
            }
             profit=prices[i]-max;
        if(output<profit){
            output=profit;
        }
        }
        return output;
    }
}
