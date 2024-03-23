package array;

public class FindElementByIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,8,7,9,0};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==9) {
				System.out.println(i);
			}
			
			if(i==1) {
				System.out.println(a[i]);
			}
		}

	}

}
