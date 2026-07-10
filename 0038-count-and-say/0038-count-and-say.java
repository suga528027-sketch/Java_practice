class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        StringBuilder sb = new StringBuilder("1");
        for(int i = 1 ; i < n ; i++)
        {
            sb = count(sb);
        }
        return sb.toString();
    }
    public static StringBuilder count(StringBuilder s)
    {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == s.charAt(i-1)) count++;
            else
            {
                sb.append(count).append(s.charAt(i-1));
                count = 1;
            }
        }
        sb.append(count).append(s.charAt(s.length()-1));
        return sb;
    }
}