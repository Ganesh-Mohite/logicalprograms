package logicalPrograms;

public class demo2 extends demo1{

	int a=300;
	
	public void m1() {
		
		int a=100;
		int b=200;
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(super.a);
		
	}
	
	public static void main(String[]args) {
		
		demo2 o=new demo2();
		o.m1();
		
	}
	
	
	
	
	
}
