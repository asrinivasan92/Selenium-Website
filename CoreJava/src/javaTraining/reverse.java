package javaTraining;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String a = "Byteaaa";
         String b = "";
         int len = a.length();
         
         for (int i = len-1; i >= 0; i--) {
			
        	b = b +a.charAt(i);
        	 
		}
         System.out.println(b);
         
         StringBuffer c = new StringBuffer(a);
          System.out.println(c.reverse());
	}

}
