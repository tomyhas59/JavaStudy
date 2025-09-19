package ex04controlstatement;

public class E05For {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("i=" + i);
		}

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합: " + sum);

		int total = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				total += i;
			}
		}
		System.out.println("1~10사이 2의 배수의 합(방법1): " + total);

		total = 0;
		for (int i = 0; i <= 10; i += 2) {
			total += i;
		}
		System.out.println("1~10 사이 2의 배수의 합(방법2): " + total);

		// for문으로 무한루프 만들 때
		int a = 1;
		for (;;) {
			System.out.println("나는 for문으로 만든 무한루프입니다." + a);
			a++;

			if (a == 10)
				break;
		}

		for (int j = 0; j <= 5; j++)
			;
		{
			System.out.println("어랏... 나는 누구? 여긴 어디?");
		}

		int i = 0;
		for (; i <= 5; i++) {
			System.out.println("for문 안에서의 i값=" + i);
		}
		System.out.println("for문 밖에서의 i값=" + i);

		/*
		 * 퀴즈1] 구구단을 출력하는 프로그램을 for문으로 작성하시오.
		 */

		for (int dan = 2; dan <= 9; dan++) {
			for (int su = 1; su <= 9; su++) {
				System.out.printf("%dX%d=%2d ", dan, su, dan * su);
			}
			System.out.println();
		}
		System.out.println("\n=========================================\n");
		/*
		 * 퀴즈2] 다음의 출력결과를 보이는 for문을 작성하시오 
		 * 출력결과	 0 0 0 1
		 * 			 0 0 1 0 
		 *  		 0 1 0 0 
		 * 			 1 0 0 0 
		 * 해법 : x와 y를 더해서 5가 될때 1을 출력한다.
		 */

		for (int x = 1; x <= 4; x++) {
			for (int y = 1; y <= 4; y++) {
				if (x + y == 5) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}

}
