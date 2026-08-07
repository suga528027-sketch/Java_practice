class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack( 0 , target , candidates , new ArrayList<>() , 0);
        return ans;
    }

    public void backtrack(int ind , int target , int[] arr , List<Integer> temp , int sum)
	{
	    if(sum == target && !ans.contains(temp))
	    {
	        ans.add(new ArrayList<>(temp));
	        return;
	    }
	    if(ind >= arr.length  || sum > target)
	    {
	        return;
	    }
	    temp.add(arr[ind]);
	    sum = sum+arr[ind];
	    backtrack(ind+1 , target , arr , temp ,sum);
	    sum -= arr[ind];
	    temp.remove(temp.size()-1);
        while (ind + 1 < arr.length && arr[ind] == arr[ind + 1]) {
            ind++;
        }
	    backtrack(ind+1 , target , arr, temp , sum);
	}
}