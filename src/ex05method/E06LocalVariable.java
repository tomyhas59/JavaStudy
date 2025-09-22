package ex05method;

public class E06LocalVariable {

	public static void main(String[] args) {
		boolean scope = true;

		/* int num = 9; */
		if (scope) {
			int num = 1;
			num++;
			System.out.println("첫번째 if문 지역:" + num);

		} else {
			int num = 5;
			System.out.println("첫번째 if문의 else 지역:" + num);

		}
		int num = 100;
		System.out.println("main 메소드 지역:" + num);

		simpleFunc();
		System.out.println("main 메소드 끝");

	}

	static void simpleFunc() {
		int num = 1000;
		System.out.println("slmple 메소드 지역:" + num);
	}

}
