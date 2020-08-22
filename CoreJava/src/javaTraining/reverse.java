package javaTraining;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String a = "Byte";
		string b = "";
		int len = a.length();
		
		for (int i = len-1; i>=0; i--) {
			
			b= b + a.charAt(i);
		}
          System.out.println(b);
         
	}

}
