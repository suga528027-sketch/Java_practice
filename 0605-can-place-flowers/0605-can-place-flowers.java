class Solution {
    public boolean canPlaceFlowers(int[] bed, int n) {
       int count=1,count1=0;
       for(int i=0;i<bed.length;i++)
       {
            if(bed[i]==0)
            {
                count++;
            }
            else count=0;
            if(count==3)
            {
                count1++;
                count=1;
            }
       } 
       if(count==2)
       {
            count1++;
       }
    return count1>=n;
    }
}