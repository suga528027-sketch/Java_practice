class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character , Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        int right = 0;
        while(right < s.length())
        {
            char ch = s.charAt(right);
            if(map.containsKey(ch))
            {
                if(left <= map.get(ch))
                {
                    left = map.get(ch)+1;
                }
            }
            max = Math.max(max , right-left+1);
            map.put(ch , right);
            right++;
        }
        return max;
    }
}