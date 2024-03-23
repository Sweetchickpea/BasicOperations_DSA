package hashSet;

import java.util.HashSet;
import java.util.Set;

public class CheckIfEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Set<Integer> hs= new HashSet<Integer>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		if(hs.isEmpty()) {
			System.out.println("hashset is empty");
		}
		
		else {
			System.out.println("hashset is not empty");
		}

	}

}
