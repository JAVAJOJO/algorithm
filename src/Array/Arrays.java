package Array;
public class Arrays {
    //初始化
    int[] elements;
    public Arrays() {
        elements = new int[0];
    }
    //压入
    public void push(int element) {
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }
    //是否为空
    public boolean isEmpty(){
        return elements.length==0;
    }
    //查看数组全部内容
    public void Seeall(){
        for (int i = 0; i <elements.length ; i++) {
            System.out.print(elements[i]);
        }
        System.out.println();
    }
    //查看栈顶
   public int STpeek(){
       if(elements.length==0){
           throw new RuntimeException("is empty");
       }
       return elements[elements.length-1];
   }
    //取出栈
   public int pollS(){
        if(elements.length==0){
             throw new RuntimeException("stack is empty");
        }
        int element=elements[elements.length-1];
        int[] newArr=new int[elements.length-1];
       for (int i = 0; i <elements.length-1 ; i++) {
           newArr[i]=elements[i];
       }
       elements=newArr;
       return element;
   }
   //查看队列底
   public int QLpeek(){
        if(elements.length==0){
            throw new RuntimeException("is empty");
        }
        return elements[0];
    }
    //取出队列
    public int pollQ(){
        int element=elements[0];
        int[]newArr=new int[elements.length-1];
        for (int i = 0; i <elements.length-1 ; i++) {
            newArr[i]=elements[i+1];
        }
        elements=newArr;
        return element;
        }
    //线性查找
    public int linesearch(int target) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                return i;
            }
        }
        return -1;
    }
    //二分法查找
    public int midsearch(int target) {
        int begin = 0;
        int end = elements.length - 1;
        int mid = (begin + end) / 2;
        while (true) {
            if (begin > end) {
                return -1;
            }
            if (elements[mid] == target) {
                return mid;
            } else {
                if (elements[mid] > target) {
                    end = mid - 1;
                } else {
                    begin = mid + 1;
                }
                mid = (begin + end) / 2;
            }
        }
    }
}



