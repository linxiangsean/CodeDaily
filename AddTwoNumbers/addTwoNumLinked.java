class addTwoNumLinked{
    public static void main(String[] args) {
        
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        //when we create a new linkedlist we need to 
        //have one dummy node to initialize,
        //when we return, we just return dummy.next;
        //can use a variable to hold the dummy node;
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        
        ListNode c1 = l1;
        ListNode c2 = l2;
        
        int carry = 0;
        while(c1 != null || c2 != null || carry != 0){
            //get c1.val and c2.val as they exist;
            int num1 = c1 == null ? 0 :c1.val;
            int num2 = c2 == null? 0 : c2.val;
            
            int sum = num1+num2+carry;
            
            int newNum = sum % 10;
            carry = sum / 10; //either 1 or 0;
            
            //put into the next of our cur list;
            cur.next = new ListNode(newNum);
            //curNext become the cur;
            cur = cur.next;
            
            //increment c1 and c2 to point to the next, if its not null
            c1 = c1 == null ? null : c1.next;
            c2 = c2 == null ? null : c2.next;
            
        }
        
        return dummy.next;
        
    }



    class ListNode {
        int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }


}