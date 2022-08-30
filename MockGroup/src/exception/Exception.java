package exception;

public class Exception {

	public void m1(String name, int age) {
		System.out.println(name+ " "+age);
		
		try {
			if(age<=18)
				throw new IllegalArgumentException("underage");
			else 
				System.out.println("allowed");
		}
		
		catch(IllegalArgumentException a) {
			System.out.println(a.getMessage());
		}
	}
		
		public static void main(String[] args) {
			Exception obj = new Exception();
			obj.m1("yyy", 17);
			obj.m1("xxx", 25);
		
	}
	
}
