package array;

public class AVGofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2,3,4,5};
		int sum=0;
		double average=0;
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		average= sum/a.length;
		System.out.println(average);

	}

}
