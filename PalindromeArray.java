package array;

import java.util.Arrays;

public class PalindromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,2,1,8}; 
		int n= a.length;
		int flag=0;
		
		for(int i=0;i<n/2;i++) {
			if(a[i]!=a[n-1-i]) {
				flag=1;
				System.out.println("not palindrome");
				break;
			}else {
				System.out.println("palindrome");
			}
		}

	}

}
