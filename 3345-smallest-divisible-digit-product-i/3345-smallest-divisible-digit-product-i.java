class Solution {
    public int smallestNumber(int n, int t) {
        int num  = n;
        while(!isPossible(num , t))
        {
            num = n++;
        }
        return num;
    }
    public boolean isPossible(int num , int t)
    {
        int pro = 1;
        while(num > 0)
        {
            int rem = num % 10;
            pro *= rem;
            num /= 10;
        }
        return pro % t == 0;
    }
}