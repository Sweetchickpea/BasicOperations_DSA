package hashSet;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Set<Integer> hs= new HashSet<Integer>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		Set<Integer> hs2= new HashSet<>();
		hs2.add(2);
		hs2.add(4);
		
		//hs.addAll(hs2);
		hs.retainAll(hs2);
		System.out.println(hs);
		
		

	}

}
