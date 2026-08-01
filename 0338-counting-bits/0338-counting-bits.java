class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            int res =i;
            int count = 0;
            while (res > 0)
            {
                int rem = res % 2;
                if(rem == 1)
                {
                    count++;
                }
                res/=2;
            }
            arr[i] = count;
        }
        return arr;
    }
}