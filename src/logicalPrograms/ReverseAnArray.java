package logicalPrograms;

public class ReverseAnArray {

	public static void main(String[]args) {
		
		int ar[]= {10,20,30,40,50,60,70,80,90,100};
		
		System.out.println("Originasl Array");
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
		
		System.out.println();
		System.out.println("Reverse Array");
		for(int i=ar.length-1;i>=0;i--)
			System.out.print(ar[i]+" ");
		
		
		
	}
	
	
	
	
	
	
	
	
}
