package ex05method;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E04MethodType03_1 {

	public static void main(String[] args) {
			Scanner scanner= new Scanner(System.in);
			
			System.out.println("시작값: ");
			int s= scanner.nextInt();
			System.out.println("종료값: ");
			int e= scanner.nextInt();
			myWantSum(s,e);
	}
	
	static void myWantSum(int start,int end) {
	
		int sum= IntStream.rangeClosed(start, end).sum();
		System.out.printf("%d~%d까지의 합은 : %d", start,end,sum);
	}

}
