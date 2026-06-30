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
    public boolean isPalindrome(ListNode head) {
        // two pointer technique
        
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        while(slow != null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        ListNode first = head;
        ListNode second = prev;
        while(second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
        
        // using ArrayList

        // List<Integer> list = new ArrayList<>();
        // ListNode  temp = head;

        // while(temp != null){
        //     list.add(temp.val);
        //     temp = temp.next;
        // }
        // int left = 0;
        // int right = list.size() - 1;

        // while(left < right){
        //     if(!list.get(left).equals(list.get(right))){
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        
        // return true;
    }
}