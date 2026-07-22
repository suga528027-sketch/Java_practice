class Solution {
    public int maxScore(int[] arr, int k) {
        int leftsum =0;
        int rightsum = 0;
        for(int i=0;i<k;i++)
        {
            leftsum += arr[i];
        }
        int  max = leftsum;
        int ind = arr.length-1;
        for(int i= k-1;i>=0;i--)
        {
            leftsum -= arr[i];
            rightsum += arr[ind];
            ind--;
            max = Math.max(max , leftsum + rightsum);
        }
        return max;
    }
}