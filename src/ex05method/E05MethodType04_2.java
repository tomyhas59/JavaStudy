package ex05method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E05MethodType04_2 {

	public static void main(String[] args) {
		int maxValue1 = returnMaxNumber(4);
		System.out.println("최대값1:" + maxValue1);
		int maxValue2 = returnMaxNumber(6);
		System.out.println("최대값2:" + maxValue2);
	}

	static int returnMaxNumber(int numberCnt) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> intArr = new ArrayList<>();

		for (int i = 1; i <= numberCnt; i++) {
			System.out.println("정수를 입력하세요");
			int inputNum = scanner.nextInt();
			intArr.add(inputNum);
		}

		return Collections.max(intArr);

	}

}
