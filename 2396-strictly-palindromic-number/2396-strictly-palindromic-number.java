class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2 ; i <= n-2 ; i++)
        {
            if(!binaryString(n,i)) return false;
        }  
        return true;
    }
    public static boolean binaryString(int n, int i){
        StringBuilder sb = new StringBuilder();
        while(n > 0 ){
            sb.append(n%i);
            n = n/i;
        }
        StringBuilder s = new StringBuilder(sb);
        return sb.reverse().toString().equals(s.toString());
    }
}