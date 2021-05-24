package LinkedList;

import java.util.HashSet;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class Test55 {
    /**
     *  算重复问题，使用HashSet
     */
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        HashSet<ListNode> set = new HashSet<>();
        while (pHead != null){
            if(set.contains(pHead.next)){
                return pHead.next;
            }
            set.add(pHead);
            pHead = pHead.next;
        }
        return null;
    }

    /**
     * 双指针法，妙啊！
     */
    public ListNode EntryNodeOfLoop2(ListNode pHead) {
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast != null && fast.next!=null){//只用判断fast是否为null
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        if(fast==null ||fast.next == null){
            return null;
        }
        //走到这块说明两个指针相遇
        //然后将slow指向pHead
        slow = pHead;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

}
