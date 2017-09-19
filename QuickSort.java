
public class QuickSort implements SortingAlgorithm{
	
	void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public int partition(int[] a, int top, int bot){
		int i = top;
		int j = bot;
		int pivot = (top + bot)/2;
		
		while(i <= j){
			while(a[i] < a[pivot])
				i++;
			while(a[j] > a[pivot])
				j--;
			if(i <= j){
				if(i == pivot)
					pivot = j;
				else if(j == pivot)
					pivot = i;
				swap(a, i++, j--);
				
			}
		}
		return i;
	}

	public void qsort(int[] arr, int top, int bot) {
		int pivot = partition(arr, top, bot);
		
		if(top < pivot -1)
			qsort(arr, top, pivot-1);
		if(pivot<bot)
			qsort(arr, pivot, bot);
		
	}

	public void sort(int[] a) {
	qsort(a, 0, a.length-1);
		
	}
	
}
