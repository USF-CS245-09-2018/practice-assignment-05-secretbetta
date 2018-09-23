
public class InsertionSort implements SortingAlgorithm {
	/**
	 * Sorts a list of integers using Insertion Sort
	 * 
	 * @param a List of integers
	 */
	public void sort(int[] a) {
		int k;
		int temp;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			k = i - 1;
			while (k >= 0 && a[k] > temp) {
				a[k+1] = a[k];
				--k;
			}
			a[k+1] = temp;
		}
	}
}
