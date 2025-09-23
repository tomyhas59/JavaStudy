package ex07String;

public class E02StringMethod1 {

	public static void main(String[] args) {
		System.out.println("String class method1");
		
		String str1="Welcome to java";
		String str2="자바야 놀자!";
		//length()
		System.out.println("### 1 ###");
		System.out.println("str1 length:" +str1.length());
		System.out.println("str2 length:" +str2.length());
		
		//charAt(인덱스)
		System.out.println("### 2 ###");
		System.out.println("str1 2nd char:" +str1.charAt(1));
		System.out.println("str2 2nd char:" +str2.charAt(1));
		
		//compareTo()
		
		System.out.println("### 3 ###");
		String str3="A";
		String str4="B";
		
		System.out.println(str3.compareTo(str4)); //-1
		System.out.println(str4.compareTo(str3)); //1
		System.out.println("ABC".compareTo("ABC")==0? "String same":"String diff");
		
		//concat()
		System.out.println("### 4 ###");
		System.out.println("JAVA".concat(" WORLD").concat(" Go"));
		System.out.println("JAVA"+"WORLD"+" GO");
		
		//contains()
		System.out.println("### 5 ###");
		System.out.println(str1.contains("To")); //false
		System.out.println(str1.contains("to")); //true
	}

}
