package LinkedList;

import java.util.HashMap;

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
/*
*    public RandomListNode Clone(RandomListNode pHead) {

        if(pHead == null) return null;

        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
        RandomListNode cur = pHead;

        while(cur != null){
            RandomListNode node = new RandomListNode(cur.label);
            map.put(cur,node);
            cur = cur.next;
        }
        //此时  已经将新老节点的对应关系保存到map中

        cur = pHead;
        while (cur !=null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        //循环结束，此时新的链表的 next 和 random 已经维护完成

        return map.get(pHead);


    }
* */
public class Test25 {
    /**
     * 使用HashMap   key-value  老节点-新节点
     */
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null){
            return null;
        }
        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
        RandomListNode cur = pHead;//pHead不动，让cur走

        //先保存新老节点的关系
        while (cur != null){
            RandomListNode node = new RandomListNode(cur.label);
            map.put(cur,node);
            cur = cur.next;
        }
        cur = pHead;
        //再维护新节点的next random
        while (cur!=null){
            map.get(cur).next = map.get(cur.next);//新节点的next为老节点next对应的新节点
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(pHead);

    }
}
