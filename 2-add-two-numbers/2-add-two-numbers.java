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
   
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
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
}