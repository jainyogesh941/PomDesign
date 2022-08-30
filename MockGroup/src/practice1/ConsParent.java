package practice1;

public class ConsParent {
       
	
	public ConsParent() {
		this(55);
		System.out.println("m4 is running");
	}

	public ConsParent(int a) {
		this(100,true);
		System.out.println("m5 is running");
	}
	
	public ConsParent(int a, boolean b) {
		
		System.out.println("m6 is running");
	}
	
	
}
