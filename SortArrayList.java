package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<Integer> al= new ArrayList<Integer>();
		
		al.add(0);
		al.add(1, 1);
		al.add(2, 9);
		al.add(4);
		
		System.out.print(al);
		
		Collections.sort(al);
		System.out.print(al);
		

	}

}
