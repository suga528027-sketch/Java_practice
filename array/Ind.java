package array;

import java.util.ArrayList;

public class Ind {

    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        int taget=5;
        System.out.println(subarraySum(arr,taget));
        
    }
    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> lst=new ArrayList<>();
        int start=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            while(sum>target && start<=i)
            {
                sum-=arr[start];
                start++;
            }
            if(sum==target)
            {
                lst.add(start+1);
                lst.add(i+1);
                return lst;
            }
        }
        lst.add(-1);
        return lst;
    }
}
