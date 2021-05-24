package LinkedList;

import java.util.HashSet;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
 * 重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class Test56 {
    /**
     * 一看到重复，我就set
     * 多次遍历，第一次遍历把重复的结点值存入 set 容器，
     * 第二次遍历，当结点值存储在 set 容器中，就删除该结点
     */
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        HashSet<Integer> set = new HashSet<>();
        ListNode pre = pHead;
        ListNode cur = pHead.next;
        //该循环将重复的节点存入set中
        while (cur != null){
            if(cur.val == pre.val){
                set.add(cur.val);
            }
            pre = cur;
            cur = cur.next;
        }

        //根据set中的值  删除重复的节点
        //先判断头节点是否重复
        while (pHead!=null && set.contains(pHead.val)){
            pHead = pHead.next;
        }
        if(pHead == null){//【记得判空】
            return null;
        }
        //再判断中间的节点
        pre = pHead;
        cur = pHead.next;
        while (cur != null){
            if(set.contains(cur.val)){
                pre.next = cur.next;
                cur = cur.next;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }

        return pHead;

    }

    /**
     * 遍历的同时删除
     *设置两个结点 pre 和 cur，
     * 当 cur 和 cur.next 值相等，cur 一直向前走，直到不等退出循环，
     * 这时候 cur 指的值还是重复值，调整 cur 和 pre 的指针再次判断
     */
    public ListNode deleteDuplication2(ListNode pHead) {
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode head = new ListNode(-1);//辅助头节点
        head.next = pHead;
        ListNode cur = head.next;
        ListNode pre = head;
        while (cur != null){
            //遇到重复节点
            if (cur.next != null && cur.next.val == cur.val) {
                // 相同结点一直前进
                while (cur.next != null && cur.next.val == cur.val){
                    cur = cur.next;
                }
                // 退出循环时，cur 指向重复值，也需要删除，而 cur.next 指向第一个不重复的值
                // cur 继续前进
                cur = cur.next;
                pre.next = cur;
            }else {//没有遇到
                pre = cur;
                cur = cur.next;
            }
        }
        return head.next;

    }

}
