package javaTraining;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isprime(10));
		allprime(20);	
	}



	public static boolean isprime(int num) {

		if (num<=1) {

			return false;
		}

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				return false;
			}

		}

		return true;
	}

	public static void  allprime(int num) {

		for (int i = 2; i <= num; i++) {
			if (isprime(i)) {
				System.out.println(i + " ");
			}
		}


	}
}
