class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high =0;
        for(int i : bloomDay)
        {
            high = Math.max(high , i);
            low = Math.min(i , low);
        }

        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(isPossible(bloomDay , m , k , mid))
            {
                high = mid -1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return low ;
    }
    public boolean isPossible(int [] bloomDay , int m , int k , int mid)
    {
        int res =0;
        int count = 0;
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i] <= mid)
            {
                count++;
            }
            else
            {
                count = 0;
            }
            if(count == k)
            {
                res++;
                count = 0;
            }
        }
       return res >= m;
    }
}