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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;

        // reverse the linked list
        ListNode prev = null;
        ListNode curr = head;
        ListNode forw = null;

        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        head = prev;
        // Delete nth node from the start of the reversed list
        if (n == 1) {
            head = head.next;
        } 
        else {
            ListNode temp = head;

            while (n > 2) {
                temp = temp.next;
                n--;
            }

            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
            }
        }
        // reverse again
        prev = null;
        curr = head;
        forw = null;

        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }

        return head = prev;
    }
}

// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode curr = head;
//         int size = 0;

//         while(curr != null){
//             size++;
//             curr = curr.next;
//         }

//         int remove = size - n;
//         if(remove == 0){
//             return head.next;
//         }
//         curr = head;

//         for(int i=1;i<remove;i++){
//             curr = curr.next;
//         }    

//         curr.next = curr.next.next;

//         return head;
//     }
// }