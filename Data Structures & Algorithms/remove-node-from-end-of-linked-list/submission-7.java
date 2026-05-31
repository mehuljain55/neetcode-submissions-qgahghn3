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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;

        ListNode temp=head;

        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }

        if(size==n)
        {
            head=head.next;
            return head;
        }

        int pos=size-n;
        int current=0;
        temp=head;

        System.out.println(pos);
        

        while(current!=pos-1)
        {
            current++;
            temp=temp.next;
        }

        System.out.println(current);
temp.next=temp.next.next;
    

        return head;

    }
}
