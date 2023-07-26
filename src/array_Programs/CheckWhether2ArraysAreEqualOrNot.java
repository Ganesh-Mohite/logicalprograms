package array_Programs;

import java.util.Arrays;

public class CheckWhether2ArraysAreEqualOrNot {

	public static void main(String[]args) {
		
		int [] ar1=new int [] {1,2,3,4,5,6,7};
		int [] ar2=new int [] {8,9,10,11,12};
		int [] ar3=new int [] {1,2,3,4,5,6,7};
		int [] ar4=new int [] {8,9,10,11,12};
		
		System.out.println("is ar1 equals ar3="+Arrays.equals(ar1, ar3));
		System.out.println("is ar2 equals ar4="+Arrays.equals(ar2, ar4));
		System.out.println("is ar1 equals ar4="+Arrays.equals(ar1, ar4));
		System.out.println("is ar2 equals ar3="+Arrays.equals(ar2, ar3));
		
		
	}
	
	
	
	
	
	
	
	
}
