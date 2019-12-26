package Array;
//1.构造器初始化2.after链起来3.remove删除4.ngi
public class LoopNode {
    int data;//A
    LoopNode next=this;//B，B指向下一个节点
    public LoopNode(int data){
        this.data=data;
    }
    //循环链表after可以通过return和void两种方式来:
    //插入节点
    public void showAll(){
        LoopNode loopN=this;
        while (true){
            System.out.print(loopN.data+" ");
            loopN=loopN.next;
            if (loopN==this)
                break;
        }
        System.out.println();
    }
    public LoopNode after(LoopNode node){
        LoopNode now=this;
        //目标：n1->n2->n1
        LoopNode Next=next;
        //这里的next指向的是n1(本身)
        this.next=node;
        //让当前类（n1）的next指向新类（n2）
        node.next=Next;
        //让新类的next指向n1,形成循环
        return this.next;
    }
    public void afte(LoopNode node){
        //目标：n1->n2->n1
        LoopNode Next=next;
        //这里的next指向的是n1(本身)
        this.next=node;
        //让当前类（n1）的next指向新类（n2）
        node.next=Next;
        //让新类的next指向n1,形成循环
    }
    //删除下一个节点
    //A->B->C:如果想删除B的话，不能直接delB，这样后面的全没了
    //只能把A的Node next接去C
    public void removeNext(){
        LoopNode newNext=next.next;
        this.next=newNext;
        //我的理解是：next这个属性是在Node类里面的
        //next指向下一个Node类
        //这里的操作则是让当前类的next指向下下个类
    }
    public LoopNode next(){
        return this.next;
    }
    public int getData(){
        return this.data;
    }
    public boolean isLast(){//有时还可以拿来验证一下有没有成链
        return next==null;
    }
}

