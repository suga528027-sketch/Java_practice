class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int bar=0;
        for(char ch:s.toCharArray())
        {
          if(ch=='*' && bar%2==0)
          {
            count++;
          }
          if(ch=='|')
          {
            bar++;
          }
        }
        return count;
    }
}