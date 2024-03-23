package hashMap;

import java.util.HashMap;
import java.util.Map;

public class RetrieveValureFromSpecificKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Map<Integer,String> mp= new HashMap<Integer,String>();
		
		mp.put(0,"a");
		mp.put(1, "b");
		if(mp.containsKey(0)) {
			System.out.println(mp.get(0));
		}

	}

}
