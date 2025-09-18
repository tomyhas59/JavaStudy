package ex02variable;

/*일반적으로 cpu는 int형에 최적화*/
public class E01JunsuType {

	public static void main(String[] args) {

		int int1 = 100;
		int int2 = 200;
		int result1 = int1 + int2;

		System.out.println("int1 + int2 =" + result1);

		/*
		Java에서는 정수와 정수를 연산하면 정수의 결과가 반환된다. 만약 실수 결과를 반환받고 싶다면 형변환을 해야함.
		 */
		result1 = int1 / int2;
		System.out.println("int1/ int2 =" + result1);

		byte byte1 = 50, byte2 = 55;

		int result2 = byte1 + byte2;

		System.out.println("byte1 + byte2 =" + result2);

		short short1 = 60, short2 = 70;
		int result3 = short1 + short2;
		System.out.println("short1 + short2 =" + result3);

		/*
		 동일 자료형끼리의 연산은 동일자료형이 됨 
		 하지만 큰 자료형과 작은 자료형을 연산하면 큰 자료형으로 자동 변환 
		 이유는 데이터의 손실(오차)가 있을 수 있기 때문
		 */
		long long1 = 1000, long2 = 2000;
		long result4 = int1 + long1;
		System.out.println("int1 + long1 =" + result4);

		result4 = long1 + long2;

		System.out.println("long1 + long2 =" + result4);
		
		/*
		 자바는 정수형 상수를 기본적으로 int형으로 간주하므로 아래 정수는 메모리에 로드하는 순간 
		 에러가 발생.
		 이때 접미사(L or l)을 붙여서 int형의 자료가 아닌 long형의 자료임을 명시해야 함.
		 이와 같이 입력되는 숫자도 자료형을 기반으로 메모리에 로드되는데 이를 가리켜 리터럴이라고 한다.
		 */
		
		/* long long3 = 2200000000; */
		long long4 = 2200000000L;
		long long5 = 2200000000l;

		System.out.println("long4 = " + long4);
		System.out.println("long5 = " + long5);
	}

}
