package ex07String;

public class E02StringMethod2 {

	public static void main(String[] args) {
		System.out.println("String class method2");

		String str1 = "Welcome to java";
		String str2 = "자바야 놀자!";

		// codePointAt()
		System.out.println("### 6 ###");
		System.out.println("str1 1st ascii code:" + str1.codePointAt(0));
		System.out.println("str2 3th ascii code:" + str2.codePointAt(2));

		// endsWith(), startsWith()
		System.out.println("### 7,8 ###");
		System.out.println("www.daum.net".endsWith("net"));// true
		System.out.println("naver.com".endsWith("http"));// false

		// format()

		System.out.println("### 9 ###");
		System.out.printf("kor:%d, eng:%d, math:%d\n", 81, 92, 100);
		String formatStr = String.format("kor:%d, eng:%d, math:%d\n", 81, 92, 100);
		System.out.println(formatStr);

		// indexOf()
		System.out.println("### 10 ###");
		String email1 = "hong@daum.net";
		System.out.println(str1.indexOf("ava"));
		System.out.println(str1.indexOf("J"));
		System.out.println((email1.indexOf("@") != -1) ? "correct email" : "email x");

	}

}
