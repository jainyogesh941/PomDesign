package overLoading;

public class Child extends Parent {
	
	public static void main(boolean a) {
		System.out.print("cycle");
		main(null);
	}
	
	public static void main(String[]args) {
		main(true);
	
	}
}