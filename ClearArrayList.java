package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ClearArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<Integer> al= new ArrayList<Integer>();
		
		al.add(0);
		al.add(1, 1);
		al.add(2, 2);
		al.add(4);
		
		
		al.clear();
		
		System.out.println(al);

	}

}
