class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> list = new ArrayList<>();
        int[] fre = new int[101];
        for(int i:bulbs)
        {
            fre[i - 0]++;
        }

        for(int i = 0;i<fre.length;i++)
        {
            if(fre[i] % 2 == 1)
            {
                list.add(i);
            }
        }
        return list;
    }
}