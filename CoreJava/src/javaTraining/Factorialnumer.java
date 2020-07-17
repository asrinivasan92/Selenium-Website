package javaTraining;

public class Factorialnumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(isfactorial(5));
	}

	public static int isfactorial(int num) {
		int fact = 1;
		if (num == 0) {
			return 1;
		}
		for (int i = 1; i <=num; i++) {
			fact = fact * i ;
		}
		return fact;
	}
}
