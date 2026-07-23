class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i:nums)
        {
            if(i<pivot)
            {
                list1.add(i);
            }
            if(i > pivot)
            {
                list2.add(i);
            }
        }
        int arr[] = new int[nums.length];
        int ind =0;
        for(int i :list1)
        {
            arr[ind++] = i;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(nums[i] == pivot)
            {
                arr[ind++] = pivot;
            }
        }
        for(int i : list2)
        {
            arr[ind++] = i;
        }
        return arr;
    }
}