
public class BubbleSort implements SortingAlgorithm{
	/*
	void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void sort(int[] arr){
		boolean swapped = true; 
		
		for(int j = 0; j < arr.length && swapped; j++){
			swapped = false;
			
			for(int i = 0; i < arr.length - 2 - j; i++){
				if(arr[i] > arr[i +1]){
					swap(arr, i, i+1);
					swapped = true;
				}
			}
		}
	}
	*/
	public void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
	
}
