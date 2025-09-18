package ex02variable;

public class E02SilsuType {

	public static void main(String[] args) {

		
		/*
		 실수자료형
		 -정수형보다는 실수형이 더 큰 자료형.
		 0과 1 사이에 무수히 많은 실수가 존해하기 때문.
		 -따라서 long과 float을 연산하면 float의 결과가 나온다.
		 */
		long long1 = 100;
		float float1 = 200;
		float result1 = long1 + float1;
		System.out.println("long1 + float1 = " + result1);

		long result2 = long1 + (long) float1;
		System.out.println("형 변환 후 연산 = " + result2);

		long result3 = (long) (long1 + float1);
		System.out.println("계산 후 형 변환 = " + result3);

		
		/*
		 java에서 실수형의 기본은 double
		 소수점이 없는 데이터는 float에 대입 가능
		 없는 데이터는 접미사(F or f)를 붙여야 한다.
		 */
		float f3 = 100;
		/* float f4 = 3.14; */
		
		//강제 형 변환 후 대입. 권장x
		float f4 = (float) 3.14;
		System.out.println("f4 = " + f4);

		//접미사를 통해 float형 자료임을 명시. 권장o
		float f5 = 3.14F;
		System.out.println("f5 = " + f5);

		float f6 = f3 + f4;
		System.out.println("f6 = " + f6);

		
		double d1 = 3.14;
		double d2 = f6 + d1;

		System.out.println("d2 = " + d2);

	    

	}

}
