package breakContinue;

public class Labelling {
	
	public static void main(String[]args) {
		outerloop:for(int i=1;i<=5;i++) {
			for(int j=1; j<=5; j++) {
				if(j == 4)
					break outerloop;
				System.out.println("Inner loop :" +j);
					
			}
			
		}
	}

}
