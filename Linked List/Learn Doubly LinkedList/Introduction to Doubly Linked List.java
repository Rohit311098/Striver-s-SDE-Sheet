//Introduction to Doubly Linked List

class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head=null;
        Node tail=null;
        for(int i=0;i<arr.length;i++)
        {
            Node newnode=new Node(arr[i]);
            if(head==null)
            {
                head=newnode;
                tail=newnode;
            }
            else
            {
                tail.next=newnode;
                newnode.prev=tail;
                tail=tail.next;
            }
            
        }
        return head;
    }
}
