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
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        ListNode current = head;
        ListNode temp = null;
        int iCnt = 0;
        int i = 0;

        while(current != null)
        {
            iCnt++;
            current = current.next;
        }

        if(n > iCnt)
        {
            return head;
        }

        current = head;

        if(n == iCnt)
        {
            if(n == 1)
            {
                head = null;
                return head;
            }
            else
            {
                head = head.next;
            }
            return head;
            
        }
        else if(n == 1)
        {
            if(current.next == null)
            {
                current = null;
                return head;
            }
            else if(current.next.next == null)
            {
                current.next = null;
            }
            else
            {
                for(i = 0; i < iCnt - 2; i++)
                {
                    current = current.next;
                }

                current.next = null;

                return head;
            }
        }

        else
        {
            for(i = 0; i < iCnt - n - 1; i++)
            {
                current = current.next;
            }  

            temp = current.next;
            current.next = temp.next;
        }

        return head;  
    }
}