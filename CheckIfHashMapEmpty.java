package hashMap;

import java.util.HashMap;
import java.util.Map;

public class CheckIfHashMapEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Map<Integer,String> mp= new HashMap<Integer,String>();
		
		mp.put(0,"a");
		mp.put(1, "b");
		
		if(mp.isEmpty()) {
			System.out.println("Map is empty");
		}
		else {
			System.out.println("Map is not empty");
		}

	}

}
