package Array;
//1.构造器初始化 2.append链起来3.after插入4.remove删除5.show显示所有节点
//6.next下一个节点7.getData查看data8.isLast判断是否有下一个节点
public class Node {
    //一个节点有两个部分：A和B，A装data，B装Node型的next（它的意思是预示下一个节点的data的值是多少）
    //最后的那个节点的B肯定是null
    int data;//A
    Node next;//B，B指向下一个节点
    public Node(int data){
        this.data=data;
    }
   public Node app(Node node){
        Node currentNode=this;//把n1给拉进来，cu=n1，不能是this.next，是的话此处的Node就变成了数据类型而非类
        while (true) {
            Node nextNode = currentNode.next;//准备把n1.next赋给cu，再把n2.next赋给cu
            if (nextNode == null)//如果cu没有下一个节点了，就停
                break;
            currentNode = nextNode;
        }
        currentNode.next=node;//当前cu的下一节点为node（也就是n3）
        return this;//返回n1的值，以便达到n1.app(n2).app(n3);
    }
    public void ap(Node node){//如果没有return值的话就不能n1.app(n2).app(n3);
        Node n=this;
        while (true){
            Node nextNode=n.next;

            if(nextNode==null)
                break;
            n=nextNode;
        }
        n.next=node;
    }
    //插入节点
    public void after(Node node){
        //目标：n1->n->n2->n3
        Node nextNext=next;
        //这里的next指向的是n2
        this.next=node;
        //让当前类（n1）的next指向新类（n）
        node.next=nextNext;
        //让新类的next指向n2
    }
    //删除下一个节点
    //A->B->C:如果想删除B的话，不能直接delB，这样后面的全没了
    //只能把A的Node next接去C
    public void remove(){
        Node newNext=next.next;
        this.next=newNext;
        //我的理解是：next这个属性是在Node类里面的
        //next指向下一个Node类
        //这里的操作则是让当前类的next指向下下个类
    }
    //显示所有节点
    public void show(){
        Node currentNode=this;
        while (true){
            System.out.println(currentNode.data+" ");
            currentNode=currentNode.next;
            if(currentNode==null)
                break;
        }
    }
    public Node next(){
        return this.next;
    }
    public int getData(){
        return this.data;
    }
    public boolean isLast(){//有时还可以拿来验证一下有没有成链
        return next==null;
    }
}

