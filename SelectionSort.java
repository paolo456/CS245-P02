
public class SelectionSort implements SortingAlgorithm{
	
	void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	int smallest(int[] arr, int start){
		int smallest = start;
		
		for(int i = start + 1; i < arr.length; i++){
			if(arr[i] < arr[smallest]){
				smallest = i;}}
			
		return smallest;}
		
	
	
	public void sort(int[] arr){
		for(int i = 0; i < arr.length; i++){
			int smallest = smallest(arr, i);
			swap(arr, smallest, i);
		}
	}
}
