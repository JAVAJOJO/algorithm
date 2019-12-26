package sort;

public class SelectSort {
    public static void selectSort(int []arr){
        for (int i = 0; i <arr.length ; i++) {
            int minIndex=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                    //记录最小的那个数的下标
                }
            }
            if(i!=minIndex){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }
}
