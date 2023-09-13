package algorithm;

import java.util.List;

public class HeapSortCaller {
    public static void main(String[] args) {
        int arr[] = {3,6,8,2,9,10,12};
        System.out.println("***Array before sorting*****");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(arr);

        System.out.println("****Array after sorting*****");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
