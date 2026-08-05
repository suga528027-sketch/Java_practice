public class Main
{
	public static void main(String[] args) {
	    int arr[] = {1,2,2,2,2,3,4,5,5};
	    int target = 2;
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
	    System.out.println(pos);
	}
}
