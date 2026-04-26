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
    public ListNode removeElements(ListNode head, int val)
    {
        List<Integer> list = new ArrayList<>();

        while(head != null)
        {
            if(head.val != val)
            {
                list.add(head.val);
            }
            head = head.next;
        }

        ListNode current = new ListNode(0);
        ListNode temp = current;

        for(Integer i : list)
        {
                temp.next = new ListNode(i);
                temp = temp.next;
        }

        return current.next; 
    }
}