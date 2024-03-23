package stack;

import java.util.Stack;

public class PushAndPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack<Integer> s= new Stack<>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.print(s);
		
		s.pop();
		System.out.print(s);
		System.out.print(s.peek());
		
		if(s.isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println("stack is not empty");
		}
		System.out.println(s.size());
		
		s.clone();
		
		
		
		
		
		
	}

}
