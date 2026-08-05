class Solution {
    public int numSplits(String s) {
        int result = 0;
        int left[] = new int[26];
        int right[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            right[s.charAt(i) -'a']++;
        }
        for(int i =0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            left[ch-'a']++;
            right[ch-'a']--;
            int count1 = 0;
            int count2 =0;
            for(int j=0;j<26;j++)
            {
                if(left[j] > 0)
                {
                    count1++;
                }
                if(right[j] > 0)
                {
                    count2++;
                }
            }
            if(count1 == count2  && count1 != 0)
            {
                result++;
            }
        }
        return result;
    }
}