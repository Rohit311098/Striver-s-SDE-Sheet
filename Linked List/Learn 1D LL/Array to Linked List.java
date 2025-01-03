//GFG- Array to Linked List
class Node {
    int data;
    Node next;

    Node() { data = 0; }
    Node(int d) { data = d; }  //constructor to create a new node
}


class Solution {
    static Node constructLL(int arr[]) {
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
                tail=newnode;
            }
        }
        return head;
    }
}
