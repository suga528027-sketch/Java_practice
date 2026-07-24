class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int left =0;
        int fre[] = new int[26];
        int maxcount =0;
        for(int i=0;i<s.length();i++)
        {
            fre[s.charAt(i)-'A']++;
            maxcount = Math.max(maxcount , fre[s.charAt(i)-'A']);
            if((i-left+1)-maxcount > k)
            {
                fre[s.charAt(left)-'A']--;
                left++;
            }
            max = Math.max(max , i-left+1);
        }
        return max;
    }
}