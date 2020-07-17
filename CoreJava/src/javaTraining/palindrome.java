package javaTraining;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ispalindrome(154);
        
	}
	
	public static void ispalindrome(int num) {
		
		int r = 0;
		int b = 0;
		int c;
		c=num;
		
		while (num>0) {
			
			r= num%10;
			b= (b*10)+r;
			num = num/10;
		}
		
		if (b==c) {
			
			System.out.println("is palindrme");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
