package practice;

public class Practice1 {
	
	int a=100;
	static int b=200;
	
	public static void m1() {
		Practice1 obj =new Practice1();
		System.out.println(b);
		System.out.println(obj.a);
		
		
	}
	
	public void m2() {
		System.out.print(a);
		System.out.print(b);
	}
	
	public static void main(String[] args) {
		Practice1 obj =new Practice1();
		m1();
		obj.m2();
	}

}
