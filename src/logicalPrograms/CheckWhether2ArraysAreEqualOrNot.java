package logicalPrograms;

import java.util.Arrays;

public class CheckWhether2ArraysAreEqualOrNot {

	public static void main(String[]args) {
		
		
		int [] ar1=new int []{10,20,30,40,50 };
		int [] ar2=new int [] {10,20,30,40,50 };
		int [] ar3=new int[] {50,40,30,20,10};
		
		System.out.println("is array 1 equals to array 2="+Arrays.equals(ar1, ar2));
		System.out.println("is array 1 equals to array 3="+Arrays.equals(ar1, ar3));
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
