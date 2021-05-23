package LinkedList;

/**
 * 反转链表
 */
public class Test15 {
    /**
     *
     * https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca
     */
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
