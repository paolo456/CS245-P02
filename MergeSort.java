
public class MergeSort implements SortingAlgorithm{
	/*
	void divide(int[] a, int[] top, int[] bot){
		int mid = a.length/2;
		
		for(int i = 0; i < mid; i++){
			top[i] = a[i];
		}
		
		for(int j = mid, i = 0 ; j < a.length ; j++, i++){
			bot[i] = a[j];
		}
	}
	void merge(int[]a, int[] top, int[] bottom){
		int topIndex = 0;
		int botIndex = 0;
		int aIndex = 0;
		
		while(topIndex < top.length && botIndex < bottom.length){
			if(top[topIndex] < bottom[botIndex]){
				a[aIndex++] = top[topIndex++];
			}
			else{a[aIndex++] = bottom[botIndex];}
			
			while(topIndex < top.length){
				a[aIndex++] = top[topIndex++];
			}
			while(botIndex < bottom.length){
				a[aIndex++] = bottom[botIndex++];
			}
		}
	}
	
	
	public void sort(int[] a) {
		//merge(a, int[] a, a.length);
		
	}
	*/
	void merge(int arr[], int l, int m, int r)
    {
        int L = m - l + 1;
        int R = r - m;
 
       //size of left and right
        int left[] = new int [L];
        int right[] = new int [R];
 
        //copying down array
        for (int i=0; i < L; ++i)
            left[i] = arr[l + i];
        for (int j=0; j<R; ++j)
            right[j] = arr[m + 1 + j];
 
        int i = 0, j = 0;
        
        int k = l;
        while (i < L && j < R)
        {
            if (left[i] <= right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        //puts remaining values
        while (i < L)
        {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < R)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
 
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;
 
            sort(arr, l, m);
            sort(arr , m+1, r);
            merge(arr, l, m, r);
        }
    }

	public void sort(int[] a) {
		sort(a, 0, a.length -1);
	}

}
