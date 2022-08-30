package exception;

public class ExceptionHandling {

	
	public static void main(String [] args) throws InterruptedException{
	
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	System.out.println(4);
	Thread.sleep(2000);
	try {
	System.out.println(5/0);
	}
	catch(ArithmeticException ref) {
		System .out.println("Exception has occured bcz of "+ ref.getMessage());
	}
	catch(NullPointerException ref1) {
		System .out.println("Exception has occured bcz of "+ ref1.getMessage());
	}
	finally {
		System .out.println("finally will execute");
	}
	
	System.out.println(6);
	
	}
}
