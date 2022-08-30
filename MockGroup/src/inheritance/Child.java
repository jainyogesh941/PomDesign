package inheritance;

public class Child extends Parent {
	
	public static void main(String[] args) {
		Parent obj =new Parent();
		obj.bunglow1();
		bunglow2();
	}
	
	public static void bunglow3() {
		System.out.println("method 3 is running");
	}

}
