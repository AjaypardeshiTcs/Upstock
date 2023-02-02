package POM;

public class String_Check {
public static void main(String[] args) {
	String s1 ="ajay";
	String s2 ="AJAY";
	 
	System.out.println(s1.length());
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toLowerCase());
	System.out.println(s2.equals(s1));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s2.contains(s1));
	System.out.println(s2.charAt(0));
	System.out.println(s1.charAt(3));
	System.out.println(s2.indexOf('A'));
	System.out.println(s2.lastIndexOf('A'));
	System.out.println(s2.endsWith("aY"));
	System.out.println(s2.endsWith("AY"));
	System.out.println(s1.startsWith("aj"));
	System.out.println(s1.endsWith("ay"));
	
	try {
		System.out.println(s1.substring(5));
	}
	catch(StringIndexOutOfBoundsException exp){
		
	}
	System.out.println(s2.substring(1));
	System.out.println(s2.concat("Kumar"));
	System.out.println(s2.replace("AJ","VIJ"));
	
}
}
