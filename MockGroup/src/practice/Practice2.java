package practice;

public class Practice2 {

	int a =100;
	
	public void m1() {
		int a =50;
		System.out.println(a);
		System.out.println(this.a);
		
	}
	
	public static void main( String []   args) {
		Practice2 obj =new Practice2();
		
		obj.m1();
	}
	 
}
