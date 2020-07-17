package javaTraining;

public class LargestSamllest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,99,-1,-98};
		int largest = a[0];
		int smallest = a[0];
		
		for (int i = 1; i < a.length; i++) {
			
		if (a[i]>largest) {
			
			largest = a[i];
		}
			
		}
		
		System.out.println(largest);
		
		for (int j = 1; j < a.length; j++) {
			
			if (a[j]<smallest) {
				
				smallest = a[j];
			}
				
			}
			
			System.out.println(smallest);
		
		
	}

}
