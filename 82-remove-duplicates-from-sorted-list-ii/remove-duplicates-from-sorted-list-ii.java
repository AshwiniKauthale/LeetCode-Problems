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
    public ListNode deleteDuplicates(ListNode head)
    {
        ListNode current = head;

        Set<Integer> set = new TreeSet<>();
        Set<Integer> duplicates = new HashSet<>();

        while(current != null) {
            if(set.contains(current.val))
            {
                set.remove(current.val);
                duplicates.add(current.val);
            }
            else if (!duplicates.contains(current.val))
            {
                set.add(current.val);
            }
            current = current.next;
        }
       

       ListNode list = new ListNode(0);

       ListNode temp = list;

       for(Integer i : set)
       {
            temp.next = new ListNode(i);
            temp = temp.next;
       }

       return list.next;   
    }
}