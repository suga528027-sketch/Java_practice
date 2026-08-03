class Solution {
    public int[] dailyTemperatures(int[] nums) {
       int arr[]=new int[nums.length];
       ArrayDeque<Integer> stack = new ArrayDeque<>();
       for(int i = nums.length-1;i>=0;i--)
       {
            while(!stack.isEmpty() && nums[i] >= nums[stack.peek()])
            {
                stack.pop();
            }
            if(!stack.isEmpty())  arr[i] = stack.peek() - i;
            stack.push(i);
       }
       return arr;
    }
}