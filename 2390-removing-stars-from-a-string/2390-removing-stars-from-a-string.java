class Solution {
    public String removeStars(String s) {
        Stack<Character> stck = new Stack<>();
        for(char ch :s.toCharArray()) 
        {
            if(ch =='*' && !stck.isEmpty())
            {
                stck.pop();
            }
            else
            {
                stck.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stck.isEmpty())
        {
            sb.append(stck.pop());
        }
        return sb.reverse().toString();
    }
}