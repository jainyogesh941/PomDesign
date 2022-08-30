package practice1;

public class Child2 extends Parent2 {

	int a= 500;
	
	public void m1() {
		Child2 obj =new Child2();
		System.out.println(obj.a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		Child2 obj =new Child2();
		obj.m1();
	}
	
}
