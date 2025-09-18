package ex02variable;

public class E04StringType {

	
	/*
	 String 클래스: 참조형 변수로써 기본자료형이 아닌 클래스로 문자열을 저장, 조작
	 Java에서는 문자열을 표현할 때 "으로 감싸주는 것만으로도 
	 문자열 변수가 생성된다.
	 연결 시에서는 + 기호를 사용
	 */
	
	public static void main(String[] args) {
		int number;
		number = 99;

		
		/*
		 클래스로 생성한 참조형 변수와 기본자료형 변수 사이에서는 형 변환 불가.
		 서로 사용하는 메모리 공간이 다르기 때문.
		 -기본자료형 : Stack 영역을 사용.
		 -클래스(참조형)변수: Heap 영역을 사용
		 */
//		
//		int stringNumber1 = (int) "100";
//		String stringNumber2 = (String) 100;

		String strNumber = "100";
		System.out.println(strNumber + number);

		String newString = new String("new 키워드 사용");
		System.out.println(newString);

		String stringBasic = "클래스지만 ";
		String plusString = "기본자료형처럼 사용";
		System.out.println(stringBasic + plusString);

		int kor = 100, eng = 99, math = 98;
		System.out.println("총점:" + kor + eng + math);
		System.out.println("총점:" + (kor + eng + math));

	
	}

}
