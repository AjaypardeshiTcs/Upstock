package POM;

public class Hello {
public static void main(String_Check[] args) {
	int i=10;
	int j=0;
	int k=j/i;
	try {
		System.out.println("iam try block");
		System.out.println("I Am running succefully");
	}
	catch (ArithmeticException excp){
		
	}
	finally {
		System.out.println("iam execyte irrespective of try and catch");
	}
}
}
