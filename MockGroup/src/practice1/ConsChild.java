package practice1;

public class ConsChild extends ConsParent{
     
	
	public ConsChild() {
		super();
	
		System.out.println("m7 is running");
	}

	public ConsChild(int a) {
		
		System.out.println("m8 is running");
	}
	
	public ConsChild (int a, boolean b) {
		this(50
				
				);
		System.out.println("m9 is running");
}
	
	public static void main(String[] args) {
		new ConsChild(100);
	}
}

