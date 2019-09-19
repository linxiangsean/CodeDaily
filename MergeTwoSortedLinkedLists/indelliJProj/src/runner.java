public class runner {
    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        l1.next = node2;
        node2.next = node3;

        ListNode l2 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);

        l2.next = node5;
        node5.next = node6;

        solution sl = new solution();
        sl.mergeTwoLists(l1,l2);

    }
}
