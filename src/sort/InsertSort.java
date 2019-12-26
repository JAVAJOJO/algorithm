package sort;
//插入排序
public class InsertSort {
    //插入排序
    //两两比较，然后替换
    public static void insertsort(int[]arr){
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<arr[i-1]){
                int temp=arr[i];
                int k;
                for (k =i-1 ; k >=0&&temp<arr[k]; k--) {
                    arr[k+1]=arr[k];
                    //此时的k值要注意下，k=i-1后的k--
                }
                arr[k+1]=temp;
            }
        }
    }
}
