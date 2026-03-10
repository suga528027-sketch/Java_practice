package array;
import java .util.*;
public class Missingelement {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        System.out.println(missingNum(arr));
        
    }
    public static int missingNum(int arr[]) {
        Set<Integer> set=new HashSet<>();
        for(int i:arr)
        {
            set.add(i);
        }
        for(int i=1;i<=arr.length;i++)
        {
            if(!set.contains(i))
            {
                return i;
            }
        }
        return arr.length+1;
    }
}
