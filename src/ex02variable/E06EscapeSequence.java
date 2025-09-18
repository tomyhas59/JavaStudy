package ex02variable;

public class E06EscapeSequence {

	public static void main(String[] args) {

		System.out.println("4월엔 벚꽃~~");
		System.out.println("4월엔\t벚꽃~~");
		
		System.out.println("Java World에 오신 걸 환엽합니다.\n");
		System.out.println("열심히\n해봅시다\n");
		
//		System.out.println("나는 "개발자"가 되고 싶어요");
		System.out.println("나는 \"개발자\"가 되고 싶어요");
		
		int kor=81, eng=97, math=79;
		System.out.printf("국어:%d, 영어:%d, 수학:%d%n", kor,eng,math);
		System.out.println("\n국어:" +kor + ", 영어:" + eng + ", 수학:" +math);
		
		double avg=(kor+eng+math)/3.0;
		System.out.printf("평균점수:%f%n",avg);
		
		/*
		 자리수 지정하기
		 %4d : 정수 출력 시 전체 자리수를 4자리로 표현
		 %6.2f : 실수 출력 시 전체 자리수는 6자리, 소수 이하 2자리로 표현
		 또한 양수는 우측 정렬, 음수는 좌측 정렬됨
		 */
		
		System.out.printf("국어:%d, 영어:%d, 수학:%d," + " 평균:%f %n" , kor,eng,math,avg);
		
		System.out.printf("국어:%6d, 영어:%6d, 수학:%6d," + " 평균:%7.4f %n" , kor,eng,math,avg);

		System.out.printf("국어:%-6d, 영어:%-6d, 수학:%-6d," + " 평균:%-7.2f %n" , kor,eng,math,avg);
		

	}
	
}
