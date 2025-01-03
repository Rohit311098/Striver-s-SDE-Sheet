//GFG- Count Linked List Nodes

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        int len=0;
        while(head!=null)
        {
            head=head.next;
            len++;
        }
        return len;
    }
}
