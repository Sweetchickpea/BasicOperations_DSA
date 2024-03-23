package hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateOverHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Set<Integer> hs= new HashSet<Integer>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		Iterator<Integer> it= hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}

	}

}
