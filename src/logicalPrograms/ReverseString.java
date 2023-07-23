package logicalPrograms;

public class ReverseString {

	
	public static void main(String[]args) {
		
		String org="Ganesh Mohite";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		
		System.out.println("Reverse of given string is="+rev);
		
	}
	
	
	
	
}
