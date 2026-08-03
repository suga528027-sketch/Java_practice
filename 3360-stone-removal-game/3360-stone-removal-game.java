class Solution {
    public boolean canAliceWin(int n) {
        boolean b = false;
        int need = 10;
        while(n >= need)
        {
            n -= need;
            need--;
            b = !b;
        }
        return b;
    }
}