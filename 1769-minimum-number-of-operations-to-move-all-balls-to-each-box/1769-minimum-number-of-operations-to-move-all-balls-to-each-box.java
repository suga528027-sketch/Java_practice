class Solution {
    public int[] minOperations(String boxes) {
        int arr[] = new int[boxes.length()];
        char ch[] = boxes.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            int sum=0;
            for(int j=0;j<ch.length;j++)
            {
                if(ch[j] =='1' )
                {
                    sum += Math.abs(j-i);
                }
            }
            arr[i] = sum;
        }
        return arr;
    }
}