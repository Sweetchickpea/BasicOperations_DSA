package array;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,2,5,6,7,7};
		
		HashSet<Integer> hs= new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		
		for(int x:hs) {
			System.out.print(x+" ");
		}
		

	}

}
