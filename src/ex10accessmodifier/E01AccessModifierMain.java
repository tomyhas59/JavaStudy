package ex10accessmodifier;

/*
다른 패키지에 작성된 것은 반드시 임포트해야 사용 가능하다.
 */
import ex10accessmodifier.sub.E01AccessModifier2;

public class E01AccessModifierMain {

	public static void main(String[] args) {

		System.out.println("E01AccessModifier1 객체 생성 및 접근");

		E01AccessModifier1 one = new E01AccessModifier1();

//		private로 선언된 멤버는 동일한 패키지에 선언하더라도 접근 불가.
//		동일한 클래스 내부에서만 접근 가능. 

//		System.out.println("one.privateVar=" + one.privateVar); 에러 발생
		System.out.println("one.defaultVar=" + one.defaultVar);
		System.out.println("one.publicVar=" + one.publicVar);

//		one.privateMethod(); 에러 발생
		one.defaultMethod();
		one.publicMethod();

		System.out.println("===========호출 후 Var===============");
		System.out.println("one.defaultVar=" + one.defaultVar);
		System.out.println("one.publicVar=" + one.publicVar);

		// 동일한 패키지에 선언된 클래스이므로 임포트 없이 인스턴스 생성 가능
		System.out.println("DefaultClass 객체 생성 및 접근");
		new DefaultClass1().myFunc();

		/////////////////////////////////////////////////////////
		///

		System.out.println("E01AccessModifier2 객체 생성 및 접근");
//		다른 패키지에 선언한 클래스 
		E01AccessModifier2 two = new E01AccessModifier2();

//		private, default 사용 불가		

//		System.out.println("two.privateVar=" + two.privateVar);에러 발생
//		System.out.println("two.defaultVar=" + two.defaultVar);에러 발생
		System.out.println("two.publicVar=" + two.publicVar);

//		two.privateMethod(); 에러 발생
//		two.defaultMethod(); 에러 발생
		two.publicMethod();

		System.out.println("DefaultClass 객체 생성 및 접근");
//		new DefaultClass2().myFunc(); 에러 발생

	}

}
