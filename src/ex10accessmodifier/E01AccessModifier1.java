package ex10accessmodifier;

//private는 class 정의에는 사용할 수 없다.
//private class PrivateClass1 {
//	void myFunc() {
//		System.out.println("class 선언 자체가 안 되므로 에러);
//	}
//}

class DefaultClass1 {
	void myFunc() {
		System.out.println("DefaultClass클래스의 myFunc()메소드 호출");
	}
}

/*
 * public 클래스는 해당 Java 파일을 대표하는 클래스로 파일명과 동일해야 한다. 또한 public 클래스는 Java 파일당 단 하나만
 * 지정할 수 있다. public으로 정의하는 경우 다른 패키지에서도 접근이 허용되므로 하나의 Java 파일에 하나의 class만 정의하는
 * 것을 권장한다.
 */
public class E01AccessModifier1 {
	private int privateVar;
	int defaultVar;
	public int publicVar;

	private void privateMethod() {
		privateVar = 100;
		System.out.println("privateMethod() 메소드 호출");
	}

	void defaultMethod() {
		defaultVar = 200;
		System.out.println("defaultMethod() 메소드 호출");
	}

	public void publicMethod() {
		publicVar = 300;
		System.out.println("publicMethod() 메소드 호출");
		privateMethod();
	}
}
