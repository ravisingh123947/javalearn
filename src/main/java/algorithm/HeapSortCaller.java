package algorithm;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapSortCaller {
    public static void main(String[] args) {
        List<Integer> arr =  new ArrayList<>(Arrays.asList(3,6,8,2,9,10,12));
        System.out.println("***Array before sorting*****");
        for(int i=0;i<arr.size();i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(arr);

        System.out.println("****Array after sorting*****");
        for(int i=0;i<arr.size();i++) {
            System.out.print(arr.get(i) + " ");
        }


        System.out.println("\n**after inserting 16 into heap***");

        for (int i = arr.size() / 2 - 1; i >= 0; i--) {
            heapSort.heapify(arr, arr.size(), i);
        }

        heapSort.insertNode(arr,16);

        for(int i=0;i<arr.size();i++) {
            System.out.print(arr.get(i) + " ");
        }

    }
}
