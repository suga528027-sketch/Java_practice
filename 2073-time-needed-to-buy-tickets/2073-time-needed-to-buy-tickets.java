class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue <Integer> queue = new ArrayDeque<>();
        for(int i=0;i<tickets.length;i++)
        {
            queue.offer(i);
        }
        int count =0;
        while(!queue.isEmpty())
        {
            int i =queue.poll();
            tickets[i]--;
            count++;
            if(i==k && tickets[i] ==0)
            {
                return count;
            }
            if(tickets[i] > 0)
            {
                queue.offer(i);
            }
        }
        return 0;
    }
}