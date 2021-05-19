package map_set;

/**
 * 解决哈希冲突----》开散列 / 哈希桶
 */
public class HashBuck {
    static class Node{
        public int key;
        public int val;
        public Node next;
        public Node(int key,int val){
            this.key = key;
            this.val = val;
        }
    }

    public Node[] array;
    public int usedSize;
    public HashBuck(){
        this.array = new Node[8];
    }

    /**
     * 放元素
     * 【1.先判断哈希桶里有没有这个key
     *   2.没有的话开始进行头插
     *   3.负载因子>0.75--扩容】
     */
    public void push(int key,int val){
        Node node = new Node(key,val);
        int index = key % array.length;//要插入的位置
        Node cur = array[index];
        while (cur!=null){
            if(cur.key == key){
                cur.val = val;
                return;
            }
            cur = cur.next;
        }

        //开始进行头插。但实际上jdk8是尾插
        node.next = array[index];
        array[index] = node;
        this.usedSize++;

        //【每次放入一个元素后，都得检查当前的哈希表的负载因子是否超过了规定的值】
        if(loadFactor() > 0.75){
            resize();
        }
    }

    //计算负载因子
    public double loadFactor(){
        return this.usedSize*1.0/this.array.length;
    }
    //超过了负载因子，需要进行扩容
    //TODO:去看源码，如果超过了负载因子，扩容是怎样扩容？
    public void resize(){
        //如果进行扩容，所有的元素都要重新进行哈希
        //所以原来数组的每个元素下面的单链表都需要遍历
        Node[] newArr = new Node[2*array.length];
        //遍历原来的数组，把原来数组的每个元素都进行重新哈希
        for (int i = 0; i < array.length; i++) {
            Node cur = array[i];//cur是每个数组元素下标对象的链表的头
            while (cur != null){
                int index = cur.key % newArr.length;//确定的是新数组的位置
                //在新的位置 头插
                Node curNext = cur.next;
                cur.next = newArr[index] ;
                newArr[index] = cur;
                cur = curNext;
            }
        }
        //走到这里，说明原来数组当中的数据全部哈希到了新的数组当中
        array = newArr;
    }

    /**
     *  获取元素
     */
    public int get(int key){
        int index = key % array.length;
        Node cur = array[index];
        while (cur != null){
            if(cur.key == key){
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;//没找到
    }

    //测试
    public static void main(String[] args) {
        HashBuck hashBuck = new HashBuck();
        hashBuck.push(1,1);
        hashBuck.push(2,2);
        hashBuck.push(10,10);
        hashBuck.push(4,4);
        hashBuck.push(5,5);
        hashBuck.push(6,6);//这个元素放完后就要扩容
        hashBuck.push(7,7);
        System.out.println(hashBuck.get(6));

        System.out.println("d,eascvqedfv");
    }
}
