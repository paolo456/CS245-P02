//package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search{

	/*
	Remove all  TODO's from final submissions.
	*/
	public String searchName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int search(int[] arr, int target){
		int min = 0;
		int max = arr.length -1;
		int mid;
		
		while(min <= max){
			mid = (min + max)/2;
			
			/*
			Also remove all unused code before final submissions.
			*/
			//System.out.println("mid " + arr[mid]);
			//System.out.println("target " + target);
			
			/*
			No reason to have parentheses around target.
			*/
			if(arr[mid] == (target)){
				return mid;}
			
			/*
			Be consistent and neat with your spaces.

			always have ... = ... or ...=...
			*/
			if(arr[mid] > (target)){
				max= mid - 1;}
			
			else{
				min = mid + 1;}
			}
		return -1;
		}
	}


