package array;
public class Secondlargest {
    public static void main(String[] args) {
        int []arr={10,8,9,5,30};
        System.out.println(seclarge(arr));
    }
    public static  int seclarge(int[] arr) {
        int first=-1;
        int sec=-1;
        for(int i:arr)
        {
            if(i>first)
            {
                sec=first;
                first=i;
            }
            else if(i>sec && i!=first)
            {
                sec=i;
            }
        }
        return sec;
    }
}
