package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<Integer> al= new ArrayList<Integer>();
		
		al.add(0);
		al.add(1, 1);
		al.add(2, 2);
		al.add(4);
		
		ListIterator<Integer> it= al.listIterator();
		
		if(it.hasNext()) {
			System.out.println(it.next()+" ");
		}

	}

}
