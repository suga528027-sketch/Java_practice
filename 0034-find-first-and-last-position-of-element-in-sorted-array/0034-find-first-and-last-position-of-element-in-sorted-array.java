class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr = new int[2];
        arr[0] = firstOccurance(nums , target);
        arr[1] = lastOccurances(nums , target);
        return arr;
    }
    public int firstOccurance(int[] arr , int target)
    {
        int low =0;
	    int high = arr.length-1;
	    int pos =-1;
	    while(low <= high)
	    {
	        int mid = (low + high ) / 2;
	        if(arr[mid] == target)
            {
                pos = mid;
                high = mid - 1;
            }
            else if(arr[mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
	    }
        return pos;
    }
    public int lastOccurances(int [] arr , int target)
    {
        int low =0;
	    int high = arr.length-1;
	    int pos =-1;
	    while(low <= high)
	    {
	        int mid = (low + high ) / 2;
	        if(arr[mid] == target)
            {
                pos = mid;
                low = mid + 1;
            }
            else if(arr[mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
	    }
        return pos;
    }
}