package abstractt;

public class Child extends Parent{

	@Override
	public void login() {
		System.out.println("1");
		
	}

	@Override
	public void homepage() {
		System.out.println("2");
	}

	@Override
	public void logout() {
		System.out.println("444");
		
	}
	
	

}
