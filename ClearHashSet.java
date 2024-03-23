package hashSet;

import java.util.HashSet;
import java.util.Set;

public class ClearHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Set<Integer> hs= new HashSet<Integer>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		hs.clear();
		System.out.println(hs);

	}

}
