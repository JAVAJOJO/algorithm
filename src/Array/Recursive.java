package Array;

public class Recursive {
    public static void main(String[] args) {
        print(3);
        //斐波那契数列 1 1 2 3 5 8
        int i=febonacci(2);
        System.out.println(i);
        //汉诺塔
        hanoi(3,'A','B','C');
    }
    public static void print(int i){
        if(i>0) {
            System.out.println(i);
            print(i - 1);
        }
    }
    public static int febonacci(int i){
        if(i==0||i==1){
            return 1;
        }else {
            return febonacci(i-1)+febonacci(i-2);
        }
    }
    public static void hanoi(int n,char from,char in,char to){
        //共有n个盘子，f i t表示三个柱子
        if(n==1){
            System.out.println("第一个盘子从"+from+"移到"+to);
        }else {
            hanoi(n-1,from,to,in);
            //移动上面的盘
            System.out.println("第"+n+"个盘子从"+from+"移到"+to);
            //移动下面的盘
            hanoi(n-1,in,from,to);
            //中间的移到目标
        }
    }
}
