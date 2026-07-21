class Solution {
    List<String > ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
       // StringBuilder sb ;
        backtrack(n , 0 , 0 , new StringBuilder());
        return ans;
    }
    public void backtrack(int n , int open , int close , StringBuilder sb)
    {
        if(sb.length() == 2 * n)
        {
            ans.add(sb.toString());
            return;
        }
        if(open < n)
        {
            sb.append("(");
            backtrack(n , open+1 , close ,sb);
            sb.deleteCharAt(sb.length() - 1);
        }
         if(close  < open)
        {
            sb.append(")");
            backtrack(n , open , close+1 ,sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}