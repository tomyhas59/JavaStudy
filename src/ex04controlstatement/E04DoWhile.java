package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

public class E04DoWhile {

	public static void main(String[] args) throws IOException {

		int sum = 0;
		int i = 1;
		do {
			sum+=i++;				
		}
		while (i <= 10) ;
		System.out.printf("1~10까지의 합 sum=%d", sum);

		
		int total=0;
		int k=1;
		do {
			if(k%4==0 || k%7==0) {
				total+=k;
		}
			k++;
		}
		while(k<=1000);
		System.out.println("1~1000 사이 4or7의 배수 합: " + total);
		
		
		Scanner scanner= new Scanner(System.in);
		int kor,eng,math,avg;
		int exitCode;
		
		do {
			System.out.println("국어점수:");
			kor=scanner.nextInt();
			System.out.println("영어점수:");
			eng=scanner.nextInt();
			System.out.println("수학점수:");
			math=scanner.nextInt();
			
			avg=(kor+eng+math)/3;
			
			switch (avg/10) {
			case 10: case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
				
				
			default:
				System.out.println("F학점");
				break;
			}
			
			System.out.println("종료하려면 x(X)를 입력하세요.");
			System.out.println("계속하려면 아무 키나 입력하세요");
			
			exitCode=System.in.read();
			
		} while(!(exitCode=='x' || exitCode=='X'));
		
		
	}

}
