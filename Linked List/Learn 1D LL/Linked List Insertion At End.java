//GFG- Linked List Insertion At End
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        Node newnode=new Node(x);
        if(head==null)
        {
            System.out.println("Head is null");
        }
        if(head==null) return newnode;
        Node tail=head;
        while(tail.next!=null)
        {
            tail=tail.next;
        }
        tail.next=newnode;
        return head;
    }
}
