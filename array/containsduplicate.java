package array;

import java.util.HashSet;
import java.util.Set;

public class containsduplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4};
        System.out.println(hasDuplicate(arr));
    }
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            if(!set.contains(i))
            {
                set.add(i);
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
