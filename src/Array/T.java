package Array;
public class T {
    public static void main(String[] args) {
        Arrays ms=new Arrays();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.push(4);
        ms.Seeall();
        //线性查找||二分法
//        System.out.println(ms.search(2));
//        //栈
//       System.out.println(ms.pollQ());
//        System.out.println(ms.STpeek());
//        System.out.println(ms.isEmpty());
//        //队列
//        System.out.println(ms.pollQ());
//        System.out.println(ms.QLpeek());
//        System.out.println(ms.isEmpty());
       //单链表
       Node n1=new Node(1);
       Node n2=new Node(2);
       Node n3=new Node(3);
       Node f=n1.app(n2).app(n3);
        // f为已经“链”好了的“n1”。其有return值，可写成n1.app(n2).app(n3);
        //事实上相当于n1.app(n2);再n1.app(n3);

        //n1.ap(n2);     //如果是void ap 的话，n1.ap(n3)不能达到左边两行的那种效果
        //n1.ap(n3);

//       System.out.println(f.next().getData());
//       System.out.println(n1.next().next().getData());
//       System.out.println(n3.isLast());
        //删除节点
        /*n1.show();
        n1.remove();
        n1.show();*/
        //插入节点
        //Node n=new Node(5);
        //n1.after(n);
        //n1.show();
        LoopNode l1=new LoopNode(1);
        LoopNode l2=new LoopNode(2);
        LoopNode l3=new LoopNode(3);
       //l1.afte(l2);
       //l2.afte(l3);
        l1.after(l2).after(l3);
        System.out.println(l1.next().getData());
        System.out.println(l2.next().getData());
        System.out.println(l3.next().getData());
        l1.removeNext();
        System.out.println(l1.getData());
        System.out.println(l1.next().getData());
        //System.out.println(l2.next().getData());
        //这里的l2节点被删除了，所以他不再链里面，它返回的值是l3的data
        System.out.println(l3.next().getData());
        DoubleNode d1=new DoubleNode(1);
        DoubleNode d2=new DoubleNode(2);
        DoubleNode d3=new DoubleNode(3);
        d1.after(d2).after(d3);
        //d1.afte(d2);
        //d2.after(d3);
        System.out.println(d2.pre().getData());
        System.out.println(d2.getData());
        System.out.println(d2.next().getData());
        System.out.println(d3.next().getData());

    }
}
