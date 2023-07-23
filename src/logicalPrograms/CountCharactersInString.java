package logicalPrograms;

public class CountCharactersInString {

	
	public static void main(String[]args) {
		
		String str="Ganesh Mohite";
		int count=0;
		System.out.println("Length of the String is="+str.length());
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
				{
					count++;
				}
		}
		System.out.println("Total count of characters in String="+count);
		
	}
	
	
	
	
	
}
