class Solution {
    public int bitwiseComplement(int n) {
        String str = Integer.toBinaryString(n);
        int pow =0;
        int res = 0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i) == '0' )
            {
                res += Math.pow(2 , pow);
            }
            pow++;
        }
        return res;
    }
}    