package javaTraining;

public class removejunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String a ="@#%$^$&$*$(($$*I am Byte";
          
          a = a.replaceAll("[^a-zA-Z0-9]", "");
          System.out.println(a);
	}

}
