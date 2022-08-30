package practice1;

public class ConstructorYogesh {
	
	public ConstructorYogesh() {
		
		System.out.println("m1 is running");
	}

	public ConstructorYogesh(int a) {
		this(100,true);
		System.out.println("m3 is running");
	}
	
	public ConstructorYogesh(int a, boolean b) {
		this();
		System.out.println("m2 is running");
		
	}
	
	public static void main(String [] args) {
		new ConstructorYogesh (55);
	}
}


