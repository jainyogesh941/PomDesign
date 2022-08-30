package practice1;

public class Child {
	
	public void main1() {
		Parent obj =new Parent();
		System.out.println(obj.a);
		System.out.println(Parent.b);

		
	}

	public static void main(String[] args) {
		Child obj =new Child();
		obj.main1();
	}
}
