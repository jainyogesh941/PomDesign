package practice;

public class Practice5 {
	static int a= 10;
	int b= 20;
	
	public static void m1() {
		int a= 30;
		 Practice5 obj =new Practice5();
		System.out.println(a);
		System.out.println(obj.b);
		System.out.println(Practice5 .a);
		
		
	}
	public static void main(String[] args) {
		m1();
	}
}

