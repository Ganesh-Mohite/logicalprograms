package logicalPrograms;

public class demo1 {

	int a=400;
	
	public void m1() {
		
		int a=100;
		int b=200;
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
	
	}
	public static void main(String[]args) {
		
		demo1 o=new demo1();
		o.m1();	
		
	}
	
	
	
	
	
	
}
