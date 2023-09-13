package algorithm;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.Collections;
import java.util.List;

public class HeapSort {
    //Heap sort function
    public void heapSort(List<Integer> arr) {
        int n = arr.size();

        // Building a max-heap for each iteration of the loop
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
            Collections.swap(arr,0,i);

            // Heapify root element recursively
            heapify(arr, i, 0);
        }
    }

    void heapify(List<Integer> arr, int n, int index) {
        // Finding the left and the right child
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

//Setting the largest out of root, left child & right child
        if (left < n && arr.get(left) > arr.get(right))
            largest = left;

        if (right < n && arr.get(right) > arr.get(largest))
            largest = right;

        // If index is not equal to largest
        if (largest != index) {
            //perform swap
            Collections.swap(arr,index,largest);

            // Calling the heapify function recursively
            heapify(arr, n, largest);
        }
    }

    public void insertNode(List<Integer> arr, int value) {
        int size = arr.size();
        arr.add(value);
        int index = size;
        size++;

        while(index > 0) {
            int parentIndex = (index-1)/2;

            if(arr.get(index) > arr.get(parentIndex)) {
                Collections.swap(arr,index,parentIndex);
                index = parentIndex;
            }else{
                break;
            }
        }
    }

}

