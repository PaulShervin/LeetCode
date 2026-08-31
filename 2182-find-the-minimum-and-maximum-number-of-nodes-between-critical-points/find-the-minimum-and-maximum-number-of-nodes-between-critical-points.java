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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] result={-1,-1};
        int min_dist=Integer.MAX_VALUE;
        ListNode prev=head;
        ListNode curr=head.next;
        int curr_ind=1;
        int prev_cri=0;
        int first_cri=0;
        while(curr.next!=null)
        {
            if(((curr.val<prev.val) && (curr.val<curr.next.val)) || ((curr.val>prev.val) && (curr.val>curr.next.val)))
            {
               if(prev_cri==0)
               {
                prev_cri=curr_ind;
                first_cri=curr_ind;
               }else{
                min_dist=Math.min(min_dist,curr_ind-prev_cri);
                prev_cri=curr_ind;
               }
            }
            curr_ind++;
            prev=curr;
            curr=curr.next;
        }
        if(min_dist!=Integer.MAX_VALUE)
        {
            int max_dist=prev_cri-first_cri;
            return new int[]{min_dist,max_dist};
        }
        return new int[]{-1,-1};
    }
}