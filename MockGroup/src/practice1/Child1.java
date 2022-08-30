package practice1;

public class Child1 extends Parent1{
	
	int a= 500;
	static int b =1050;

	
	public static void main(String[] args) {
		Child1 obj =new Child1 ();
	System.out.println(obj.a);
	System.out.println(b);
	System.out.println(Parent1 .b);
	System.out.println(obj .a);
}
}
