package sort;
import java.util.Arrays;
public class Testsort {
    public static void main(String[] args) {
        //
        //int[]arr=new int[]{5,7,2,9,4,1,0,5,7};
        //归并准备的数组a
        //int[]a=new int[]{1,3,5,2,4,6,8,10};
        //BubbieSort b=new BubbieSort();
        //b.bubblesort(arr);
        //System.out.println(Arrays.toString(arr));
        //这个类的方法不是static，所以不能类名.方法
        //InsertSort.insertsort(arr);
        //SelectSort.selectSort(arr);
       // MergeSort.mergeSort(arr, 0,arr.length-1);
        //System.out.println(Arrays.toString(arr));
        //这个类的方法是static，可直接类名.方法来调用方法
        int[] arr1 = new int[] {23,6,189,45,9,287,56,1,798,34,65,652,5};
        RadixSort.radixSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
