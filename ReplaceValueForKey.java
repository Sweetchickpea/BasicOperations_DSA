package hashMap;

import java.util.HashMap;
import java.util.Map;

public class ReplaceValueForKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Map<Integer,String> mp= new HashMap<Integer,String>();
		
		mp.put(0,"a");
		mp.put(1, "b");
		
		mp.replace(0, "c");
		System.out.println(mp);
		
		mp.replace(1, "b", "c");
		System.out.println(mp);

	}

}
