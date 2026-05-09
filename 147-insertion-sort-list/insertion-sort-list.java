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
    public ListNode insertionSortList(ListNode head)
    {
        ListNode current = head;
        int iCount = 0;

        while(current != null)
        {
            iCount++;
            current = current.next;
        }

        int Arr[] = new int[iCount];
        int i = 0;

        current = head;

        while(current != null)
        {
            Arr[i] = current.val;
            current = current.next;
            i++;
        }

        i = 0;
        Arrays.sort(Arr);
        current = head;

        for(i = 0; i < Arr.length; i++)
        {
            current.val = Arr[i];
            current = current.next;
        }

        return head;
    }
}