package javaTraining;

public class missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,5,6};
		int sum1 = 0;
		int sum2 = 0;
		
		//first add the numbers in array
		//second add all in array
		
		for (int i = 0; i < a.length; i++) {
			
			sum1 = sum1 + a[i];
			
		}
		
		System.out.println(sum1);
		
       for (int j = 0; j<=6 ; j++) {
			
			sum2 = sum2 + j;
			
		}
		
		System.out.println(sum2);
		
		System.out.println("Missing number is" + (sum2-sum1));

	}

}
