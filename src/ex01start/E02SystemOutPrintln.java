package ex01start;

/*
 println()	내용 출력 후 자동 줄바꿈
 print()	출력 후 줄바꿈 x, 줄바꿈 하려면 \n 추가
 printf()	출력 내용을 서식에 맞춰 출력.
 			%d, %f, %s, %n 등등
 			줄바꿈을 위한 %n은 printf()에서만 가능
 			 			
 */
public class E02SystemOutPrintln {

	public static void main(String[] args) {
		int num1 = 100;
		System.out.println("num1=" + num1);
		System.out.print("num1=" + num1 + "\n");
		System.out.printf("num1=%d%n", num1);

		System.out.println(7);
		System.out.println(3.14);
		
		System.out.println(3 + 5);
		System.out.println(3.5 + 5.1);

		System.out.println("3+5=" + 8);
		System.out.println("3.15" + "는 실수입니다.");
		System.out.println("3+5" + "의 연산 결과는 8입니다.");

		System.out.println("num1 은" + num1 + " 입니다.");
	}

}
