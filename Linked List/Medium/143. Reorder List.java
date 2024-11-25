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

    public int getlen(ListNode head)
    {
        int len=1;
        while(head!=null)
        {
            head=head.next;
            len++;
        }
        return len;
    }

    public ListNode getreverse(ListNode head)
    {
        ListNode curr=head;
        ListNode nex,prev=null;
        while(curr!=null)
        {
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        head=prev;
        return head;
    }

    public ListNode flattern(ListNode head1,ListNode head2)
    {
        ListNode head=head1;
        while(head1!=null && head2!=null)
        {
            ListNode nex1=head1.next;
            ListNode nex2=head2.next;
            head1.next=head2;
            head2.next=nex1;
            head1=nex1;
            head2=nex2;
        }
        return head;
    }

    public void reorderList(ListNode head) {
        int len=getlen(head);

        //If length is less than 2 then no need to do anything
        if(len<=2) return;
        int half=len/2;
        int c=1;
        ListNode temp=head;
        while(c<half)
        {
            temp=temp.next;
            c++;
        }
        if(len%2==1)
        {
            temp=temp.next;
        }
        ListNode head2=getreverse(temp.next);
        temp.next=null;
        head=flattern(head,head2);       
    }
}
