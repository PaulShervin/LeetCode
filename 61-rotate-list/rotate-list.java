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
        if(head==null || head.next==null || k==0)
        {
            return head;
        }
        int count=1;
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        }
        k=k%count;
        temp.next=head;
        ListNode n_node=temp;
        int fin=count-k;
        for(int i=0;i<fin;i++)
        {
            n_node=n_node.next;
        }
        ListNode final_node=n_node.next;
        n_node.next=null;
        return final_node;

    }
}