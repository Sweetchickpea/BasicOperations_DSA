package hashSet;

import java.util.HashSet;
import java.util.Set;

public class CheckIfElementExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Set<Integer> hs= new HashSet<Integer>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		if(hs.contains(1)) {
			System.out.println("element exists!");
		}
		else {
			System.out.println("element doesn't exist");
		}

	}

}
