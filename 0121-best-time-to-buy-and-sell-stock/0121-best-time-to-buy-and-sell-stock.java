class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : prices)
        {
            if(min > i)
            {
                min = i;
            }
            max_profit = Math.max(max_profit , i - min);
        }
        return max_profit;
    }
}