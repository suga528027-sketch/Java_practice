class Solution {
    public int maxProduct(int n) {
        int first = 0;
        int sec = 0;
        while(n > 0)
        {
            int rem = n%10;
            if(rem > first)
            {
                sec = first;
                first = rem;
            }
            else if(rem > sec)
            {
                sec = rem;
            }
            n/=10;
        }
        return first * sec;
    }
}