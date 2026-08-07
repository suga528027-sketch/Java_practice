class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        if(k > n)
        {
            return answer;
        }

        backtrack(1 , k , n , new ArrayList<>() , 0);
        return answer;
    }

    public void backtrack(int ind , int k , int n , List<Integer> temp , int sum)
    {
        if(temp.size() == k  && sum == n)
        {
            answer.add(new ArrayList<>(temp));
            return;
        }
        if(sum > n || temp.size() > k)
        {
            return;   
        }
        for(int i = ind ; i<=9 ;i++)
        {
            temp.add(i);
            backtrack(i + 1 , k , n , temp , sum + i);

            temp.remove(temp.size() - 1);
        }
    }
}