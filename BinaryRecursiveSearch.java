package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search{

	public String searchName() {
		// TODO Auto-generated method stub
		return null;
	}
	public int search(int[] arr, int target) {
		
		return search(arr, target, 0, arr.length-1);
	}

	public int search(int[] arr, int target, int min,int max){
		int mid = (min+max)/2;
		
		if(min > max)
			return -1;
		if(arr[mid] == target)
			return mid;
		if(arr[mid] < target){
			
			return search(arr, target, mid+1, max);
		}
		
		else{
			return search(arr, target, min, mid-1);
		}
		}
	
	

}
