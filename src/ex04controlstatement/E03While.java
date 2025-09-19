package ex04controlstatement;

public class E03While {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println("변수 i= " + i++);

		}

		int sum = 0;
		int j = 1;
		while (j <= 10) {
			sum += j++;
		}
		System.out.printf("1~10까지의 합 sum=%d", sum);

		
		int total=0;
		int k=1;
		while(k<=100) {
			if(k%3==0 || k%4==0) {
				total+=k;
				System.out.println("k=" +k);
			}
			k++;
		}
		System.out.println("3 또는 4의 배수의 합: " + total);
		
		//구구단
		int dan=2;
		while(dan<=9) {
			int su=1;
			while(su<=9) {
				System.out.printf("%-2dX%2d=%2d%n",dan,su,dan*su);
				su++;
			}
		dan++;
			
		}
		
		System.out.println("\n=========================================\n");
		
		int x=1;
		while(x<=4) {
			int y=1;
		
			while(y<=4) {
				if(x==y) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
				y++;
			}
			System.out.println();
			x++;
		}
		
		/*
		연습문제] 아래와 같은 모양을 출력하는 while문을 작성하시오.
			출력결과
				0 0 0 1
				0 0 1 0
				0 1 0 0
				1 0 0 0
		*/
		System.out.println("\n=========================================\n");
		int x2=1;
		while(x2<=4) {
			int y2=1;
		
			while(y2<=4) {
				if(x2+y2==5) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
				y2++;
			}
			System.out.println();
			x2++;
		}
		
		
		
	}

}
