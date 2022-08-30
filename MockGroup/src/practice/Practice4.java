package practice;

public class Practice4 {
	static int a= 10;
	int b= 20;
	
	public void m1() {
		int a= 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println( Practice3 .a);
		
	}
	
	public static void main(String[] args) {
		Practice4 obj = new Practice4();
				
		obj.m1();
	}

}
