package hashMap;

import java.util.HashMap;
import java.util.Map;

public class RemoveKeyValuePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Map<Integer,String> mp= new HashMap<Integer,String>();
		
		mp.put(0,"a");
		mp.put(1, "b");
		
		mp.remove(0);
		System.out.println(mp);
		
		mp.remove(1, "b");
		System.out.println();

	}

}
