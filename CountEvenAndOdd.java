package array;

public class CountEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,7,8,3,5,6};
		
		int n= a.length;
		
		int countE=0;
		int countO= 0;
		
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				countE++;
				
			}else if(a[i]%2!=0){
				countO++;
				//break;
			}
			
		}
		System.out.println(countE+" "+countO);

	}

}
