class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int arr[] = new int[nums.length];
       Arrays.fill(arr , -1);
       Deque<Integer> stack = new ArrayDeque<>();
       for(int j = 2*nums.length -1 ; j >=0 ; j--)
       {
            int num = nums[j % nums.length];
            while(!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            } 


            if(j < nums.length && !stack.isEmpty())
            {
                arr[j] = stack.peek();
            }
            stack.push(num);   
       } 
       return arr;
    }
}