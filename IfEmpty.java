package linkedList;

import java.util.LinkedList;
import java.util.List;

public class IfEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<Integer> ll= new LinkedList<Integer>();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		if(ll.isEmpty()) {
			System.out.println("is empty");
		}
		else {
			System.out.println("not empty");
		}

	}

}
