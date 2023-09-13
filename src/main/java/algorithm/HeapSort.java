package algorithm;

public class HeapSort {
    //Heap sort function
    public void heapSort(int arr[]) {
        int n = arr.length;

        // Building a max-heap for each iteration of the loop
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify root element recursively
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int index) {
        // Finding the left and the right child
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

//Setting the largest out of root, left child & right child
        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If index is not equal to largest
        if (largest != index) {
            //perform swap
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;

            // Calling the heapify function recursively
            heapify(arr, n, largest);
        }
    }
}

