package hashMap;

import java.util.HashMap;
import java.util.Map;

public class CheckIfValueExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Map<Integer,String> mp= new HashMap<Integer,String>();
		
		mp.put(0,"a");
		mp.put(1, "b");
		
		if(mp.containsValue("a")) {
			System.out.println("value exists");
		}else {
			System.out.println("value is absent");
		}

	}

}
