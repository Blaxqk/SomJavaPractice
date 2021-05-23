package LinkedList;

import java.util.Stack;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 如果该链表长度小于k，请返回空。
 */
public class Test14 {
    /**
     * 双指针,妙哇！
     */
    public ListNode FindKthToTail1 (ListNode pHead, int k) {
        // write code here
        ListNode first = pHead;
        ListNode last = pHead;
        for (int i = 0; i < k; i++) {
            if(first == null) return first;
            first = first.next;
        }
        while (first!=null){
            first = first.next;
            last = last.next;
        }
        return last;

    }






    }
