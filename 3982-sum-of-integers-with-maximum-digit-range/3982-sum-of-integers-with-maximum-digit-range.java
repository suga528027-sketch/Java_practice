class Solution {
    Map<Integer , Integer> map = new HashMap<>();
    public int maxDigitRange(int[] nums) {
        int maxRange = 0;
        int result = 0;
        for(int i : nums)
        {
            maxRange = Math.max(maxRange , helper(i));
        }

        for(int i : nums)
        {
            if(map.get(i) == maxRange)
            {
                result += i;
            }
        }
        return result;
    }
    public int  helper(int i)
    {
        int temp = i;
        int min = Integer.MAX_VALUE;
        int max = 0;
        while(i > 0)
        {
            int rem = i % 10;
            min = Math.min(rem , min);
            max = Math.max(rem , max);
            i /= 10;
        }
        int range = max - min;
        map.put(temp , range);

        return range;
    }
}