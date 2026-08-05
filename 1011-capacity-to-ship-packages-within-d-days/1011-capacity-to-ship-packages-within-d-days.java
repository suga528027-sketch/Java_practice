class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int i:weights)
        {
            low = Math.max(low , i);
            high += i;
        }
        while(low <= high)
        { 
            int mid = low + (high -low)  / 2;
            if(isPossible(weights , days , mid))
            {
               high = mid -1;
            }
            else
            {
                low = mid+1;
            }
        }
        return low;
    }
    public boolean isPossible(int[] weights , int days , int capacity)
    {
        int count_days= 1;
        int sum =0;
        for(int i:weights)
        {
            if(sum + i <= capacity)
            {
                sum += i;
            }
            else
            {
                sum = i;
                count_days++;
            }
        }
        return count_days <= days;
    }
}