package hashMap;

import java.util.HashMap;
import java.util.Map;

public class CreateAndPopulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> mp= new HashMap<Integer,String>();
		
		mp.put(0,"a");
		mp.put(1, "b");
		
	
		for(Map.Entry<Integer,String>me:mp.entrySet()) {
			System.out.println(me.getKey()+" "+me.getValue());
		}

	}

}
