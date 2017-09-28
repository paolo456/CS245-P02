
public class ArrayStack implements Stack{

	private Object[] arr;
	private int top;
	
	public ArrayStack(){
		arr = new Object[10];
		top = 0;
	}
	//pushes element to the top of stack
	public void push(Object item) {
		if(top == arr.length)
			grow_stack();
		arr[top++] = item;
		
	}
	//removes element from top of stack
	public Object pop() {
		if(empty())
			return null;
		return arr[--top];
	}
	//returns the top of stack
	public Object peek() {
		if(empty())
			return null;
		return arr[top-1];
	}
	//returns true of stack is empty
	public boolean empty() {
		if(top == 0)
			return true;
		return false;
	}
	//grows the stack by *2
	private void grow_stack(){
		Object[] newarr = new Object[arr.length * 2];
		System.arraycopy(arr, 0, newarr, 0, arr.length);
		arr = newarr;
	}

}
