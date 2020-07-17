package javaTraining;

public class reverseinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num = 1245;
         int rev = 0;
         
         while (num!=0) {
        	 
        	 //formula
        	 rev = rev * 10 + num % 10;
        	 num = num /10;
			
		}
         System.out.println(rev);
	}

}
