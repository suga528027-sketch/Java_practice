class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int total_sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            total_sum += nums[i];
            sum = Math.max(nums[i] , sum+nums[i]);
            max = Math.max(sum , max);
        }
        sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i:nums)
        {
            sum = Math.min(i , sum + i);
            min = Math.min(sum , min);
        }
        if(total_sum == min)
        {
            return max;
        }
        return Math.max(max , total_sum - min);
    }
}