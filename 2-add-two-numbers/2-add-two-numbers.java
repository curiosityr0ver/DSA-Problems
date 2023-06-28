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
   
    public ListNode bvddTwoNumbers(ListNode list1, ListNode list2) {
        ListNode temp1 = list1,temp2 = list2, res = new ListNode(), pointer = res;
        int dig1 = 0, dig2 = 0, sum = 0, carry = 0;
     
        
        while(temp1 != null || temp2 != null || carry > 0) {
            dig1 = 0;
            dig2 = 0;
            
            if(temp1 != null) {
                dig1 = temp1.val;
                temp1 = temp1.next;
            }
            if(temp2 != null) {
                dig2 = temp2.val;
                temp2 = temp2.next;
            }
            sum = dig1 + dig2 + carry;
            pointer.next = new ListNode(sum%10);
            carry = sum/10;
            pointer = pointer.next;
        }
        return res.next;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        
        int carry=0;
        while(l1!=null || l2!=null || carry==1){
            
            int sum=0;     
            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
            sum+=carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }
}