package vector;

import java.util.Vector;

public class Basicfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v= new Vector<>();
		
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		System.out.print(v);
		
		v.remove(2);
		v.clone();
		v.set(2, 10);
		

	}

}
