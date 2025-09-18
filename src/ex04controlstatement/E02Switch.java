package ex04controlstatement;

import java.util.Scanner;

public class E02Switch {

	public static void main(String[] args) {

		Scanner sacnner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int iNum = sacnner.nextInt();
		System.out.printf("입력한 숫자는 %d", iNum);

		int remain = iNum % 3;

		switch (remain) {
		case 0:
			System.out.println("나머지는 0입니다");
			break;
		case 1:
			System.out.println("나머지는 1입니다");
			break;

		default:
			System.out.println("나머지는 2입니다");
		}

		//long은 사용 불가능, int, char, String은 사용 가능
		long ln = 100;

//			switch(ln) {
//			case 100: System.out.println("long 타입 사용??");
//			default : System.out.println("안 되는군!");
//			}

//		switch(iNum%3==0) {
//        System.out.print("논리식도 안 되는군);
//	}

		String title = "자바";
		switch (title) {
		case "자바":
			System.out.println("자바 좋아");
			break;
		case "JAVA":
			System.out.println("JAVA Goooood");
		}

		int season = iNum;
		switch (season) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("여름입니다.");
			break;
		case 10:
			System.out.println("가을니다.");
			break;
		case 11:
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다.");
			default: System.out.println("화창합니다.");
		}
	}

}
