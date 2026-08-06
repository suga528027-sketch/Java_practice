class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;
        for(int i = n-2; i >= 0; i--)
        {
            if(nums[i] < nums[i+1])
            {
                ind = i;
                break;
            }
        }
        if(ind == -1)
        {
            reverse( 0  , n-1 , nums);
            return;
        }
       for(int i = n-1; i >= 0; i--)
        {
            if(nums[i] > nums[ind])
            {
                swap(nums , i , ind);
                break;
            }
        }
        reverse(ind+1 , n-1 , nums);
    }
    public void reverse(int left , int right , int nums[])
    {
        while(left < right)
        {
            swap(nums , left , right);
            left++;
            right--;
        }
    }
    public void swap( int nums[] , int i ,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}