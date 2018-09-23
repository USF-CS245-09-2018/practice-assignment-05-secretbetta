
public class QuickSort implements SortingAlgorithm {
	
	/**
	 * Sorts an array of ints using quicksort
	 * @param a Array of ints
	 * 
	 * @see #partition(int[], int, int)
	 * @see #sorter(int[], int, int)
	 */
	public void sort(int[] a) {
		sorter(a, 0, a.length - 1);
	}
	
	int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j=low; j<high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
	
    void sorter(int arr[], int low, int high) { 
        if (low < high) {
            int pi = partition(arr, low, high);
            
            sorter(arr, low, pi-1);
            sorter(arr, pi+1, high);
        }
    }
}
