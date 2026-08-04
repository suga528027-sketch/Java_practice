class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean b[] = new boolean[nums.length];
        backtrack( 0 , nums , new ArrayList<>() ,b);
        return ans;
    }
    public void backtrack(int index , int [] nums , List<Integer> temp , boolean b[])
    {
        if(temp.size() == nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(b[i]) 
            {
                continue;
            }
            if(i> 0 && nums[i] == nums[i-1]&& !b[i-1]) 
            {
                continue;
            }
            temp.add(nums[i]);
            b[i] = true;
            backtrack(index , nums , temp , b);
            temp.remove(temp.size()-1);
            b[i] = false;
        }
    }
}