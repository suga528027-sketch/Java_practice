class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int i:nums)
        {
            while(i!=0)
            {
                int rem = i%10;
                if(rem == digit)
                {
                    count++;
                }
                i/=10;
            }
        }
        return count;
    }
}