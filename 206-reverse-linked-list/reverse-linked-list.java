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
    public ListNode reverseList(ListNode head)
    {
        ListNode current = head;
        int iCount = 0;
        int i = 0;

        while(current != null)
        {
            iCount++;
            current = current.next;
        }

        int Arr[] = new int[iCount];

        while(head != null)
        {
            Arr[i] = head.val;
            head = head.next;
            i++;
        }

        i = Arr.length - 1;

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for (i = iCount - 1; i >= 0; i--) {
            temp.next = new ListNode(Arr[i]);
            temp = temp.next;
        }
        
        return dummy.next;

    }
}