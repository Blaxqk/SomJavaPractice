package map_set;

import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/copy-list-with-random-pointer/submissions/
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针random指向一个随机节点），请对此链表进行深拷贝，并返回拷贝后的头结点。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class LeetCode138 {
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        HashMap<Node,Node> map = new HashMap<>();
        Node cur = head;

        while(cur != null){
            Node node = new Node(cur.val);
            map.put(cur,node);
            cur = cur.next;
        }
        //此时  已经将新老节点的对应关系保存到map中

        cur = head;
        while (cur !=null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        //循环结束，此时新的链表的 next 和 random 已经维护完成

        return map.get(head);

    }
    public static void main(String[] args) {

    }
}
