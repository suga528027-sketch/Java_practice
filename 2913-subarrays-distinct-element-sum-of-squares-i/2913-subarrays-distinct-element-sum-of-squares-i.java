class Solution {
    public int sumCounts(List<Integer> nums) {
        int res = 0;
       
        for(int i = 0; i < nums.size(); i++)
        {
            Map<Integer , Integer> map = new HashMap<>();
            for(int j = i; j < nums.size(); j++)
            {
               // System.out.println(map);
                map.put(nums.get(j) , map.getOrDefault(nums.get(j),0)+1);
                res += map.size() * map.size();
                System.out.println(map.size());
            }
            
        }
        return res;
    }
}