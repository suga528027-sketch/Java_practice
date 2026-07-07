class Solution {
    public List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        int nums[]= new int[n];
        for(int i = 0;i<n;i++)
        {
            nums[i] = i+1;
        }
        backtrack(0 , k , nums , new ArrayList<>());
        return ans;
    }
    public void backtrack(int start , int k , int nums[] , List<Integer> list)
    {
        if(list.size() == k )
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = start ; i<nums.length;i++)
        {
            list.add(nums[i]);
            backtrack(i+1 , k , nums , list);
            list.remove(list.size()-1);
        }
    }
}