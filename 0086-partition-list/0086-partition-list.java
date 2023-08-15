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
    public ListNode partition(ListNode head, int x) {
        
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        ListNode temp = head;
        
        while(temp != null) {
            if(temp.val < x) arr1.add(temp.val);
            else arr2.add(temp.val);
            temp = temp.next;
        }
        
        temp = head;
        for(int ele: arr1){
            temp.val = ele;
            temp = temp.next;
        }
        for(int ele: arr2){
            temp.val = ele;
            temp = temp.next;
        }
        
        return head;
    }
}