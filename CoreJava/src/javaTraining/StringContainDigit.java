package javaTraining;

public class StringContainDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "1234";
		char y[] = x.toCharArray();
		int size = y.length;
		
		int i =0 ;
		while (i!=size) {
			
			if (y[i]>='0' && y[i]<='9') {
				
				i++;
			}
			else {
				
				System.out.println("not a string");
				System.exit(0);
			}
		}
		System.out.println("Its a string");
	}

}
