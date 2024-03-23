package array;

import java.util.HashMap;
import java.util.Map;

public class MergeSortedArray {
	
	public static void mergedArrays(int[] a, int[] b, int n1,int n2) {
		HashMap<Integer,Integer>hm= new HashMap<>();
		
		for(int i=0;i<n1;i++) {
			hm.put(a[i], i);
		}
		for(int i=0;i<n2;i++) {
			hm.put(b[i], i);
		}
		
		for(Map.Entry<Integer,Integer>me:hm.entrySet()) {
			System.out.print(me.getKey()+" ");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4};
		int[] b= {3,4,5,6};
		int n1= a.length;
		int n2= b.length;
		
		mergedArrays(a,b,n1,n2);

	}

}
