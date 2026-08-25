class Solution {
    public List<List<Integer>> groupThePeople(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int i  = 0; i < nums.length; i++)
        {
            map.put(i , nums[i]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(map.get(i) == -1) continue;
            int value = map.get(i);
            for(Integer k : map.keySet())
            {
                if(temp.size() < value && map.get(k) == value)
                {
                    temp.add(k);
                    map.put(k , -1);
                }
            }
            ans.add(new ArrayList<>(temp));
            temp.clear();
        }
        return ans;
    }
}