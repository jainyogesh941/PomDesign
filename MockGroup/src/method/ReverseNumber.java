package method;

public class ReverseNumber {

	public static void main(String[]arsg) {
		int number=987654, reverse=0;
		while(number!=0) {
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
			
					
		}
		
		System.out.print(reverse);
		
			
	}
}
