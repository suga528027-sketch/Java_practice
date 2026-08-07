class Solution {
    public int findTargetSumWays(int[] nums, int target) {
         
        return backtrack(0 , nums , target , 0);
    }

    public int backtrack(int ind , int [] nums , int target , int sum)
    {
        if(ind == nums.length)
        {
            return  sum == target ? 1 : 0;
        }

         int add = backtrack(ind + 1 , nums , target , sum + nums[ind]);

         int sub = backtrack(ind+1 , nums , target , sum - nums[ind]);

         return add + sub;
    }
}