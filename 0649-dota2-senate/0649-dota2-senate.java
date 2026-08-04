class Solution {
    public String predictPartyVictory(String senate) {
        Queue <Integer> r = new ArrayDeque<>();
        Queue <Integer> d = new ArrayDeque<>();
        for(int i=0;i<senate.length();i++)
        {
            if(senate.charAt(i) =='R')
            {
                r.offer(i);
            }
            else
            {
                d.offer(i);
            }
        }
        while(!r.isEmpty() && !d.isEmpty())
        {
            int r1 = r.poll();
            int d1 = d.poll();

            if(r1 < d1)
            {
                r.offer(r1+senate.length());
            }
            else
            {
                d.offer(d1 + senate.length());
            }
        }
        return r.isEmpty() ? "Dire" : "Radiant";
    }
}