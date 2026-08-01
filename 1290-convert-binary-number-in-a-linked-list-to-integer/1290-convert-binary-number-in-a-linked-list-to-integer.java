/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        int res =0;
        int pow = 0;
        while(temp != null)
        {
            list.add(temp.val);  
            temp = temp.next;
        }
        for(int i = list.size()-1;i>=0;i--)
        {
            if(list.get(i) ==1)
            {
                res += Math.pow(2 , pow);
            }
            pow++;
        }
        return res;
    }
}