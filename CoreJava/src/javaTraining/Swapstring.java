package javaTraining;

public class Swapstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a = "selenium";
        String b = "Java";
        
        String c = a+b;
        
        System.out.println(c);
        
        b = c.substring(0, c.length()-b.length());
        System.out.println(b);
        a = c.substring(8, 12);
        System.out.println(a);
        
        int a1 = 10;
        int b1 = 5;
        int c1;
        c1 = a1;
        a1= b1;
        b1 = c1;
        System.out.println(a1);
        System.out.println(b1);
        
        
	}

}
