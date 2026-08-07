class Solution {
    List<String> answer = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0)
        {
            return answer;
        }
        String [] arr = {"" , "" , "abc" ,"def", "ghi", "jkl", "mno",  "pqrs", "tuv", "wxyz" };

        backtrack( 0 , new StringBuilder() , arr , digits);

        return answer;
    }

    public void backtrack(int index , StringBuilder sb , String arr[] , String digits)
    {
        if(index == digits.length())
        {
            answer.add(sb.toString());
            return;
        }
        int temp = digits.charAt(index) -'0';
        String dummy = arr[temp];

        for(int i = 0; i < dummy.length(); i++)
        {
            sb.append(dummy.charAt(i));

            backtrack(index +1 , sb , arr , digits);

            sb.deleteCharAt(sb.length() -1);
        }
    }
}