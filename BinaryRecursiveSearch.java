//package edu.usfca.cs.cs245;

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
		if(arr[mid] < target){ // Do not leave random white space inbetween lines.  Makes it confusing to look at.
			
			return search(arr, target, mid+1, max);
		}
		
		/*
		The standard for connected logic statements is to have:

		if (...) {
			...	
		} else if (...) {
			...
		} else {
			...
		}


		Also, it is highly suggested to always put curly brackets with your loops and
		conditionals to make it very clear what is happening.
		*/
		else{
			return search(arr, target, min, mid-1);
		}
		}
	
	

}
