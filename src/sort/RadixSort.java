package sort;

import Array.Arrays;

public class RadixSort {
    public static void radixSort(int[]arr){
        //数组中最大的数字
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max)
                max=arr[i];
        }
        //最大数字是几位数
        int maxLength=(max+"").length();
        /*//临时数组
        int[][]temp=new int[10][arr.length];
        //一个一个柱子里面要存的东西的空间
        int[]counts=new int[10];*/
        Arrays[] temp = new Arrays[10];
        //为队列数组赋值
        for(int i=0;i<temp.length;i++) {
            temp[i]=new Arrays();
        }
        //比多少次
        for (int i = 0,n=1; i <maxLength ; i++,n*=10) {
            //arr1里面的全部归类，放到柱子里面，由个位到？位
            for (int j = 0; j <arr.length ; j++) {
                int ys=arr[j]/n%10;
                //放第ys根柱，柱里的第counts[ys]
                //temp[ys][counts[ys]]=arr[j];
                //counts[ys]++;
                temp[ys].push(arr[j]);
            }
            int index=0;
            /*for (int k = 0; k <counts.length ; k++) {
                if (counts[k]!=0){
                    for (int l = 0; l<counts[k] ; l++) {
                        arr[index]=temp[k][l];
                        index++;
                    }
                    counts[k]=0;
                }
            }*/
            for (int k = 0; k <temp.length ; k++) {
                while (!temp[k].isEmpty()){
                    arr[index]=temp[k].pollQ();
                    index++;
                }
            }
        }
    }
}
