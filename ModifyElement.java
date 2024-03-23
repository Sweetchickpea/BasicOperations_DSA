package linkedList;

import java.util.LinkedList;
import java.util.List;

public class ModifyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<Integer> ll= new LinkedList<Integer>();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		ll.set(1,6);
		System.out.print(ll);

	}

}
