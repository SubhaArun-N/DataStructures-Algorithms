package ProblemSheet;

import java.util.Stack;

public class QueueUsingStacks{
	
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	
	public QueueUsingStacks(){
		
	}
	
	public void enqueue(int x) {
		
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		
		s1.push(x);
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	
	public int dequeue() {
		return s1.pop();
	}
	
	public int peek() {
		return s1.peek();
	}
	
	public int top() {
		return s1.peek();
	}
	
	public static void main(String[] args) {
		QueueUsingStacks queue = new QueueUsingStacks();
		queue.enqueue(5);
		queue.enqueue(2);
		queue.enqueue(3);
		
		System.out.println(queue.dequeue());
	}
}
