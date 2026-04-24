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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        if(list1 == null && list2 == null)
        {
            return null;
        }

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        LinkedList<Integer> list = new LinkedList<>();

        while(temp1 != null)
        {
            list.add(temp1.val);
            temp1 = temp1.next;
        }

        while(temp2 != null)
        {
            list.add(temp2.val);
            temp2 = temp2.next;
        }

        Collections.sort(list);

        ListNode iRet = new ListNode(0);
        ListNode temp = iRet;

        for(Integer i : list)
        {
            temp.next =  new ListNode(i);
            temp = temp.next;
        }

        return iRet.next;
    }
}
