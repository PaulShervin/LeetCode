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
        if(head==null || head.next==null ||k==0)
        {
            return head;
        }
        ListNode temp=head;
        int count=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        } 
        temp.next=head;
        k=k%count;
        int fin=count-k;
        ListNode n_node=temp;
        for(int i=0;i<fin;i++)
        {
            n_node=n_node.next;
        }
        ListNode final_node=n_node.next;
        n_node.next=null;
        return final_node;


    }
}