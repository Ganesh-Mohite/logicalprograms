package array_Programs;

public class FindDuplicateOrCommonNumsInArray {

	public static void main(String[]args) {
		
		int [] ar1= {10,20,30,40,50,60,70,80,90,100};
		int [] ar2= {30,50,70,90};
		
		for(int i=0;i<=ar1.length-1;i++)
		{
			for(int j=0;j<=ar2.length-1;j++)
			{
				if(ar1[i]==ar2[j])
				{
					System.out.print(ar1[i]+" ");
			}
		}
		
		
		
		
		
		
		
	}
	
	
	}
}
	
	
	
	
	
	
	
	
	

