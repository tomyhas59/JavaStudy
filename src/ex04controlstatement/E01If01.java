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

		/*
		시나리오] 사용자가 입력한 문자가 숫자인지 판단하는 프로그램을 if문을 이용해서 작성하시오.
		참조) System.in.read() : 키보드를 통해 입력한 문자의 아스키코드를 정수형으로 반환하는 메서드. 
								두글자 이상 입력하더라도 첫번째 문자만 입력된다.  
		 */

		System.out.println("하나의 문자를 입력하세요");
		int asciiCode=System.in.read();
		System.out.println("입력한 문자는:" + (char) asciiCode);
		
		if(asciiCode >= 48 && asciiCode<=57) {
			System.out.println("입력한 문자는 숫자입니다.");
		}else {
			System.out.println("입력한 문자는 숫자가 아닙니다.");
		}
		
		if(asciiCode>='0' && asciiCode<='9') {
			System.out.println("입력한 문자는 숫자입니다.[1]");
		}else {
			System.out.println("입력한 문자는 숫자가 아닙니다.[1]");
		}
	}
}
