//237. Delete Node in a Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public void deleteNode(ListNode node) {

      //Traverse till second last node
        while(node.next.next!=null)
        {
            node.val=node.next.val;
            node=node.next;
        }
      //Change value of second last node with last node
        node.val=node.next.val;

      //Then making the current node next value to next so that the size decrease by one.
        node.next=null;
    }
}
