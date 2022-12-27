package files;

public class removeLinkedListElements {

	public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ListNode prev = null;
        if (head != null && curr == head) {
            if (head.val == val) {
                head = head.next;
                curr = curr.next;
            }
        }
        while (curr != null) {
            if (curr.val == val) {
                if (prev != null) {
                    prev.next = curr.next;
                    curr = curr.next;
                } else {
                    head = curr.next;
                    curr = curr.next;
                }
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
	
}
