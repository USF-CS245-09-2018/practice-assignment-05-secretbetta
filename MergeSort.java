public class MergeSort implements SortingAlgorithm {

	/**
	 * Merge Sort
	 * @param a array of ints
	 * 
	 * @see #sorting(int[], int, int)
	 * @see #merge(int[], int, int, int)
	 */
	public void sort(int[] a) {
		sorting(a, 0, a.length - 1);
	}
	
	/**
	 * Sorts and merges
	 * @param a array of ints
	 * @param start starting index of array
	 * @param end last index of array
	 * 
	 * @see #merge(int[], int, int, int)
	 */
	public static void sorting(int a[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			
			sorting(a, start, mid);
			sorting(a, mid + 1, end);
			
			merge(a, start, end, mid);
		}
	}
	
	/**
	 * Merges two arrays while comparing values to sort
	 * @param a array
	 * @param start starting index of array
	 * @param end last index of array
	 * @param mid midpoint index of array
	 */
	public static void merge(int[] a, int start, int end, int mid) {
		int len1 = mid - start + 1;
		int len2 = end - mid;
		
		int[] temp1 = new int[len1];
		int[] temp2 = new int[len2];
		
		for (int x = 0; x < len1; x++) {
			temp1[x] = a[start + x];
		}
		
		for (int x = 0; x < len2; x++) {
			temp2[x] = a[mid + 1 + x];
		}
		
		int index1 = 0;
		int index2 = 0;
		
		int index = start;
		while (index1 < len1 && index2 <  len2) { 
			if (temp1[index1] < temp2[index2]) {
				a[index] = temp1[index1];
				index1++;
			} else {
				a[index] = temp2[index2];
				index2++;
			}
			index++;
		}
		
		while (index1 < len1) {
			a[index] = temp1[index1];
			index++;
			index1++;
		}
		
		while (index2 < len2) {
			a[index] = temp2[index2];
			index++;
			index2++;
		}
		
		
	}
}
