package ex04controlstatement;

import java.io.IOException;

public class E01If01 {
	public static void main(String[] args) throws IOException {
		int num = 10;
//		if(num%2) {
//			System.out.println("잘못된 조건식입니다");
//		}else (num){
//			System.out.println("이것도 잘못된 조건식입니다");
//		}

		if (num % 2 == 0) {
			System.out.printf("%d는 짝수입니다.", num);
		}

		if (num % 2 == 0 && num >= 10) {
			System.out.printf("%n%d는 짝수이고 10보다 크거나 같다.", num);
		}

		if (true) {
			System.out.println("무조건 실행");
		}

		if (num % 2 == 1) {
			System.out.printf("%d는 홀수입니다.", num);
		}

		if (num % 2 == 0)
			System.out.printf("%d는 짝수입니다.", num);

		if (num % 2 != 0) {
			System.out.println("num은 " + num + "입니다.");
			System.out.println(num + "은 홀수입니다.");
		}

		
		System.out.println("하나의 문자를 입력하세요");
		int asciiCode=System.in.read();
		System.out.println("입력한 문자는:" + asciiCode);
		
		if(asciiCode >= 48 && asciiCode<=57) {
			System.out.println("입력한 문자는 숫자입니다.");
		}else {
			System.out.println("입력한 문자는 숫자가 아닙니다.");
		}
		
	}
}
