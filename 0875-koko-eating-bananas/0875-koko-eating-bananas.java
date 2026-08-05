class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long low =1;
        long high =0;
        for(int i:piles)
        {
            high = Math.max(high , i);
        }
        while(low <= high)
        {
            long mid =  (low + high)  / 2;
            if(isPossible(piles , h , mid))
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return (int)low;
    }

    public boolean isPossible(int [] piles , int h , long bananas)
    {
        long hour = 0;
        for(int i:piles)
        {
            hour += (i + bananas - 1) / bananas;
        }
        return hour <= h;
    }
}