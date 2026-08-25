class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums)
        {
            set.add(i);
        }
        int i = k;
        while(set.contains(k))
        {
            if(!set.contains(k))
            {
                return k;
            }
            k += i;
        }
        return k;
    }
}