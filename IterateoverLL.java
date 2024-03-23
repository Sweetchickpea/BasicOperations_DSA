package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IterateoverLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<Integer> ll= new LinkedList<Integer>();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		Iterator<Integer> it= ll.iterator();
		
		if(it.hasNext()) {
			System.out.print(it.next()+" ");
		}

	}

}
