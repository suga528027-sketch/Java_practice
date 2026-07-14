class Solution {
    public int countDistinctIntegers(int[] nums) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums)
        {
            set.add(i);
            if(i > 9)
            {
                int rev = 0;
                while(i!=0)
                {
                    int rem = i%10;
                    rev = rev * 10 + rem;
                    i/=10;
                }
                set.add(rev);
            }
        }
        return set.size();
    }
}