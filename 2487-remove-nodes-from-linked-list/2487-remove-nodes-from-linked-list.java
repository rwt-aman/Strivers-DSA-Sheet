class Solution { // Linked list 
    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next == null) return head;  
              
        // Linked list reverse
        ListNode prev = null;
        ListNode curr = head;
        ListNode forward = null;

        while(curr != null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        head = prev;

        // Using two pointer to check 
        ListNode i = head;
        ListNode j = i.next;

        while(j != null){
            if(j.val < i.val ){
                j = j.next;
            }
            else{
                i.next = j;
                i = j;
                j = j.next;
            }
        }
        i.next = j;//point to null skip less value
        // Again reverse linked list
        prev = null;
        curr = head;
        forward = null;

        while(curr != null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        head = prev;

        return head; // or return prev
    }
}




// Using stack 

// class Solution {
//     public ListNode removeNodes(ListNode head) {
//         Stack<ListNode> st = new Stack<>();
//         ListNode temp = head;

//         while(temp != null){
//             while(st.size() > 0 && temp.val > st.peek().val){
//                 st.pop();
//             }
//             st.push(temp);

//             temp = temp.next;
//         }
//         while(st.size() > 0){
//             ListNode top = st.pop();
//             top.next = temp;
//             temp = top;
//         }
//         return temp;
//     }
// }