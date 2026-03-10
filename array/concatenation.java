package array;
import java.util.*;
public class concatenation {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums) {
        int arr[]=new int [2*nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
            arr[nums.length+i]=nums[i];
        }
        return arr;
    }
}
