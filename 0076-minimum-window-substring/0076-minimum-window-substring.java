class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int fre [] = new int[128];
        int count = 0;
        for(char ch : t.toCharArray())
        {
            count++;
            fre[ch]++;
        }
        int start = 0 , min = Integer.MAX_VALUE;
        int left = 0 ;
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(fre[s.charAt(i)] > 0 ) 
            {
                count--;
            }
            fre[s.charAt(i)]--;
            while( count == 0 )
            {
                if(i - left +1 < min)
                {
                    min = i - left + 1;
                    start = left;
                }
                fre[s.charAt(left)]++;
                if(fre[s.charAt(left)] > 0) 
                {
                    count++;
                }
                left++;
            }
        }
        if( min == Integer.MAX_VALUE)
        {
            return "";
        }
        return s.substring(start , start+min);
    }
}