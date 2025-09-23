package ex07String;

public class E01StringBasic {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		String numResult = (num1 == num2) ? "data same" : "data different";
		System.out.println("compare result:" + numResult);

		String str1 = new String("Hello JAVA");
		String str2 = new String("Hello JAVA");

		if (str1 == str2) {
			System.out.println("str1, str2 reference address same");
		} else
			System.out.println("str1, str2 reference address different");

		if (str1.equals(str2)) {
			System.out.println("String same");
		} else {
			System.out.println("String different");
		}
		String str3 = "자바개발자";
		String str4 = "자바개발자";
		if(str3==str4) {
			System.out.println("same address");
		}else {
			System.out.println("different address");
		}
		System.out.println("the end");
	}
}
