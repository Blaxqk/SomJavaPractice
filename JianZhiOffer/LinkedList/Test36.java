package LinkedList;

import java.util.HashSet;

/**
 * 输入两个无环的单链表，找出它们的第一个公共结点。
 * TODO:可能出现的问题，思路是对的，大部分的代码也是对的，就只有一个条件判断错了，所以结果不对
 */
public class Test36 {
    /**
     *  暴力破解：双重循环
     */
    public static  ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2==null){
            return null;
        }
        ListNode cur2 = pHead2;
        while (pHead1!=null){
            while (pHead2!=null){
                if(pHead1 == pHead2){
                    return pHead1;
                }

                pHead2 = pHead2.next;
            }
            pHead1 = pHead1.next;
            pHead2 = cur2;
        }
        return null;
    }

    /**
     * p1： 0-1-2-3-4-5-null(此时遇到ifelse)-a-b-4-5-null
     * p2: a-b-4-5-null(此时遇到ifelse)0-1-2-3-4-5-null
     * 因此，两个指针所要遍历的链表就长度一样了！
     * 如果两个链表存在公共结点，那么p1就是该结点，如果不存在那么p1将会是null。
     */
    public static  ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2==null){
            return null;
        }
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
            if(p1 != p2){//因为上面两行已经改变了p1 , p2所以还要先判断一下
                if(p1 == null){
                    p1 = pHead2;
                }
                if(p2 == null){
                    p2 = pHead1;
                }
            }

        }
        return p1;
    }

    /**
     * 约等于 重复节点，使用set
     */
    public static  ListNode FindFirstCommonNode3(ListNode pHead1, ListNode pHead2) {
        HashSet<ListNode> set = new HashSet<>();
        while (pHead1!=null){
            set.add(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2!=null){
            if(set.contains(pHead2)){
                return pHead2;
            }
            pHead2 = pHead2.next;
        }
        return null;
    }

    /**
     * 双指针法
     * 先统计两个链表的长度。让较长的先走，直到两个链表长度一样，这个时候两个链表再同时每次往后移一步，
     * 看节点是否一样，
     */
    public  ListNode FindFirstCommonNode4(ListNode pHead1, ListNode pHead2) {
        int lenA = length(pHead1);
        int lenB = length(pHead2);
        //如果两个的长度不一样，那么使长度一样
        while (lenA != lenB){
            if(lenA > lenB){
                pHead1 = pHead1.next;
                lenA--;
            }else {
                pHead2 = pHead2.next;
                lenB--;
            }
        }

        //走到这里，说明长度一样了
        while (pHead1!=pHead2){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;

    }
    public static int length(ListNode node){
        int len = 0;
        while (node != null){
            len++;
            node = node.next;
        }
        return len;
    }

        public static void main(String[] args) {
        ListNode t1 = new ListNode(1);
        ListNode t2 = new ListNode(2);
        ListNode t3 = new ListNode(3);
        ListNode t4 = new ListNode(6);
        ListNode t5 = new ListNode(7);
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = t5;

        ListNode q1 = new ListNode(4);
        ListNode q2 = new ListNode(5);
        ListNode q3 = new ListNode(6);
        ListNode q4 = new ListNode(7);
        q1.next = q2;
        q2.next = q3;
        q3.next = q4;


            System.out.println(length(t1));
            System.out.println(length(t2));

    }
}
