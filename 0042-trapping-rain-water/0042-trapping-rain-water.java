class Solution {
    public int trap(int[] height) {
        int sum = 0;
        int n = height.length;
        int prefixmax [] = new int[n];
        int sufixmax [] = new int[n];
        prefixmax[0] = height[0];
        for(int i=1;i<n;i++)
        {
            prefixmax[i] = Math.max(height[i] , prefixmax[i-1]);
        }
        sufixmax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            sufixmax[i] = Math.max(height[i] , sufixmax[i+1]);
        }
        for(int i=0;i<n;i++)
        {
            int left = prefixmax[i];
            int right = sufixmax[i];
            if(height[i] < left && height[i] < right )
            {
                sum += Math.min(left , right)-height[i];
            }
        }
        return sum;
    }
}