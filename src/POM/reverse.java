package POM;

public class reverse {
public static void main(String[] args) {
	String org="ajay";
   String rev="";
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
			
		}
		System.out.println(rev);
}
}
