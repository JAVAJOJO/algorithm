package Array;
public class DoubleNode {
    //上一个节点
    //单链表适合删除和添加，双链表适合查询工作
    DoubleNode pre=this;
    DoubleNode next=this;
    int data;
    public DoubleNode(int data) {
        this.data=data;
    }
    //增加节点

    public DoubleNode after(DoubleNode node){
        DoubleNode now=this;
        DoubleNode nextNext=next;
        this.next=node;
        node.pre=this;
        node.next=nextNext;
        nextNext.pre=node;
        return this.next;
    }
    public void afte(DoubleNode node){
        DoubleNode nextNext=next;
        this.next=node;
        node.pre=this;
        node.next=nextNext;
        nextNext.pre=node;
    }
    public DoubleNode next(){
        return this.next;
    }
    public DoubleNode pre(){
        return this.pre;
    }
    public int getData() {
        return this.data;
    }
}

