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
    
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode point = head;
        
        while(point != null) {
            arr.add(point.val);
            point = point.next;
        }
        
        Collections.reverse(arr);

        
        ListNode root = new ListNode();
        point = root;
        
        for(int i = 0; i < arr.size()-1; i++) {
            point.val = arr.get(i);
            point.next = new ListNode();
            point = point.next;
        }
        point.val = arr.get(arr.size()-1);
        return root;
        
    }
}