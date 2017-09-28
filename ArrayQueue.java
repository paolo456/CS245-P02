
public class ArrayQueue implements Queue{
	Object[] arr;
	int head;
	int tail;
	public ArrayQueue(){
		arr = new Object[10];
		head = 0;
		tail = 0;
	}
	//dequeue function to remove head
	public Object dequeue(){
		if(empty()){
			return null;
		}
		Object item = arr[head];
		head++;
		
		if(head == arr.length)
			head = 0;
		
		return item;
	}
	//adds an element to the end of the queue
	public void enqueue(Object item){
		if(full())
			grow_queue();
		arr[tail++] = item;
		
		if(tail == arr.length)
			tail = 0;
		
	}
	//checks if queue is empty
	public boolean empty(){
		if(head == tail)
			return true;
		
		return false;
	}
	//checks of queue is full
	private boolean full(){
		if((tail + 1) % arr.length == head)
			return true;
		return false;
	}
	//grows queue by 2
	private void grow_queue(){
		Object[] newarr = new Object[arr.length * 2];
		if(head<tail){
			System.arraycopy(arr, 0, newarr, 0 , arr.length);
			arr = newarr;}
		
		if(tail < head){
			
			System.out.println("arr: " + arr[head] + "newarr: " + newarr[0]);
			System.arraycopy(arr, head, newarr, 0 , arr.length-head);
			System.arraycopy(arr, 0, newarr, arr.length-head, tail);
			tail = arr.length-1;
			head = 0;
			arr = newarr;
		}
		
		//System.arraycopy( arr, 0, newarr, arr.length-tail, tail+1);
	}
	

}
