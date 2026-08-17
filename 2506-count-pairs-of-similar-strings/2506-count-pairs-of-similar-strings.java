class Solution {
    public int similarPairs(String[] words) {
        int count = 0 ;
        for(int i = 0 ; i < words.length ; i++)
        {
            for(int j = i+1 ; j < words.length ; j++)
            {
                if(isPossible(words[i] , words[j]))
                {
                    System.out.println(words[i] + " " + words[j]);
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isPossible(String s1 , String s2)
    {
        for(char ch : s2.toCharArray())
        {
            if(!s1.contains(String.valueOf(ch)))
            {
                return false;
            }
        }
        for(char ch :  s1.toCharArray())
        {
            if(!s2.contains(String.valueOf(ch)))
            {
                return false;
            }
        }
        return true;
    }
}