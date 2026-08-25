class Solution {
    public int maximumNumberOfStringPairs(String[] words) 
    {
        int count = 0;

        for(int i = 0; i < words.length; i++)
        {
            for(int j = i+1; j < words.length; j++)
            {
                if(isEqual(words[i] , words[j]))
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public boolean isEqual(String s1 , String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }
        int j = s2.length()-1;
        for(int i = 0; i < s1.length(); i++)
        {
            if(s1.charAt(i) != s2.charAt(j))
            {
                return false;
            }
            j--;
        }
        return true;
    }
}