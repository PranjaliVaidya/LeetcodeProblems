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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }

        if(c==0 || k==0 || k%c==0)
        {
            return head;
        }

        if(k>c){
            int val=k%c;
            k=val;
        }
        int diff=c-k;
        int count=0;
        ListNode temp1=head;
        while(temp1!=null)
        {
            
            count++;
            if(count==diff) break;
            temp1=temp1.next;
        }
       
       ListNode temp2=temp1.next;
       ListNode newHead=temp2;
       temp1.next=null;
        while(temp2.next!=null)
        {
            temp2=temp2.next;
        }
       temp2.next=head;
       
       return newHead;

    }
}
