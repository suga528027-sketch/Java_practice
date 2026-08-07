class Solution {
    List<List<Integer>>  ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack( 0 , target , candidates , new ArrayList<>() , 0);

        return ans;
    }

    	public  void backtrack(int ind , int target , int[] arr , List<Integer> temp , int sum)
	{
	    if(sum == target)
	    {
	        ans.add(new ArrayList<>(temp));
	        return;
	    }
	    if(ind == arr.length  || sum > target)
	    {
	        return;
	    }
	    for(int i = ind ; i < arr.length ; i++)
        {
            temp.add(arr[i]); 
             
            backtrack(i , target , arr , temp , sum + arr[i]);
 
            temp.remove(temp.size()-1);
        }
	}
}