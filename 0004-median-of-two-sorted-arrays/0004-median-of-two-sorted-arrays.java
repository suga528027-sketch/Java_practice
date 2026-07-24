class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length + nums2.length];
        int left =0;
        int right = 0;
        int ind =0;
        while(left < nums1.length && right < nums2.length)
        {
            if(nums1[left] < nums2[right])
            {
                arr[ind++] = nums1[left];
                left++;
            }
            else 
            {
                arr[ind++]=nums2[right++];
            }
        }
        while(left<nums1.length)
        {
            arr[ind++] = nums1[left];
            left++;
        }
        while(right < nums2.length)
        {
            arr[ind++]=nums2[right++];
        }
        System.out.print(Arrays.toString(arr));
        if(arr.length % 2 ==0)
        {
            int mid = arr.length /2;
            return (double)(arr[mid] + arr[mid-1])/2;
        }

        return arr[arr.length /2];
    }
}