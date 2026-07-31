class Solution {
    public int longestPalindrome(String s) {
        Map<Character , Integer> map = new HashMap<>();
        for(char ch:s.toCharArray())
        {
            map.put(ch , map.getOrDefault(ch , 0)+1);
        }
        int count =0;
        boolean b = false;
        for(char i:map.keySet())
        {
            if(map.get(i) % 2 == 0)
            {
                count += map.get(i);
            }
            else
            {
                count += map.get(i)-1;
                b = true;
            }
        }
        if(b)
        {
            count++;
        }
        return count;
    }
}