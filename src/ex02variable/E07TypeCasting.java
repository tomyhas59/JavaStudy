package ex02variable;

public class E07TypeCasting {

	public static void main(String[] args) {
		/*
		 * 자동형변환: 작은 자료형의 데이터를 큰 자료형에 대입할 때 자동형변환됨 자료의 손실이 없을 때만 적용됨.
		 */
		byte b1 = 65;
		short s1;
		s1 = b1;
		System.out.printf("b1은 %d, s1은 %d%n", b1, s1);

		/*
		 * 아래 코드는 자동형변환 x cpu는 int보다 작은 자료를 연산할 때 int로 간주하여 진행하고 결과로 int 반환 따라서 이 부분은
		 * int형에 최적화된 cpu의 특성으로 생각하면 됨.
		 */
		int num1 = b1 + s1;
		System.out.println("num1은 " + num1);

		/*
		 * 문자형에 정수형을 바로 대입할 수 없다 특성이 다르므로 강제형변환 후 대입해야 함
		 */
//		char ch1 = b1;
		char ch2 = (char) b1;
		System.out.println("b1=" + b1 + ", ch2=" + ch2);

		/*
		 * 명시적 형변환: 큰 자료를 작은 자료형에 할당할 때 사용 데이터 손실이 없을 때만 사용해야 함
		 */

		// byte 범위 -127~128, 129 이상을 할당 시 -127부터 재시작
		short s2 = 100;
		byte b2 = (byte) s2;
		System.out.printf("데이터미손실:b2=%d, s2=%d\n", b2, s2);

		int num3;
		double dl = 3.14;
		num3 = (int) dl;

		System.out.printf("데이터손실:num3=%d, dl=%.2f %n", num3, dl);

		char ch3 = 'A', ch4;
		int num4 = 2;
//		ch4 = ch3 + num4;
		ch4 = (char) (ch3 + num4);
		System.out.println("ch4= " + ch4);
		
		

	}
	
	

}
