package sort;

import java.util.Arrays;

public class BubbieSort {
    //冒泡排序
    public void bubblesort(int []arr){
        //比较多少轮(叠罗汉)
        for(int i=0;i<arr.length-1;i++){
            //比较的次数(画圈)
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
