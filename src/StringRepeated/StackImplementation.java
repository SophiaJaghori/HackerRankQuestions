package StringRepeated;

import java.util.Stack;

public class StackImplementation {
	int array[] = new int[5];
	int top = 0;
	private boolean push(int x) {
		top++;
		array[top] = x;
		System.out.println("Element pushed in to the stack = "+x);
		return true;
		
		
	}
	private int pop() {
		int x = array[top--];
		System.out.println("Elements popted from the stack "+ x);
		return x;
		
	}
	private int peek() {
		return array[top];
	}
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		//stack.push(50);
		stack.pop();
		stack.peek();
		stack.push(99);
		

	}

}
