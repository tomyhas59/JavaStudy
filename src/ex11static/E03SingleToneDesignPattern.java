package ex11static;

/*
 싱글 디자인 패턴
 1. 생성자의 접근지정자를 private로 선언
 2. 클래스 외부에서는 생성자에 접근 불가하므로 new를 통해 인스턴스 생성 불가
 3. 클래스 내부의 멤버변수를 static으로 선언하여 인스턴트 미리 생성해 놓음.
 4. getInstance()라는 유틸리티 메서드를 통해 참조값을 반환받아 사용
 5. 이 방법을 통해 인스턴스를 생성하면 메모리에 딱 하나만 만들어지게 되므로 
 메모리 절약 가능.
 */

class NoSingleTone {
	int instVar;

	/*
	생성자는 대부분 public으로 선언한다.
	만약 public으로 선언하지 않으면 클래스 외부 혹은 다른 패키지에서는 호출할 수 없기 
	때문에 new를 통해 인스턴스 생성 자체가 불가능하기 때문
	 */
	public NoSingleTone() {
	}
}

//싱글톤 패턴이 적용된 클래스 정의
class SingleTone {
	//일반적인 멤버변수 선언
	int shareVar;
	
	/*
	 정의한 클래스와 동일한 타입으로 선언된 정적 멤버변수로 JVM에 의해 
	 프로그램이 시작될 때 미리 Method 영역에 로드되어 사용할 준비가 된다.
	 */
	private static SingleTone single = new SingleTone();

	/*
	 생성자를 private로 선언하면 클래스 외부에서는 호출 불가하므로 new를 통해 
	 인스턴스 생성 불가
	 */
	private SingleTone() {
		
		

	}

	/*
	정적 메서드로 선언된 getInstance()를 통해 해당 인스턴스의 참조값을 
	외부로 반환하는 getter() 메서드이다.
	 */
	
	public static SingleTone getInstance() {
		return single;
	}

	void print() {
		System.out.println(String.format("shareVar=%d", shareVar));
	}
}

public class E03SingleToneDesignPattern {
	public static void main(String[] args) {
		/*
		 일반적인 방식의 인스턴스 생성, new로 생성할 때마다 새로운 인스턴스가 생성되어 
		 참조값을 할당받에 된다.
		*/
		NoSingleTone nst1 = new NoSingleTone();
		nst1.instVar = 100;
		System.out.println("nst1=" + nst1);

		NoSingleTone nst2 = new NoSingleTone();
		nst2.instVar = 200;
		System.out.println("nst2=" + nst2);

		/*
		생성자를 private로 선언하면 클래스 외부엥서는 호출할 수 없으므로 
		new를 통해 인스턴스 생성 불가
		 */
//		SingleTone st1 = new SingleTone();

		SingleTone st2 = SingleTone.getInstance();
		st2.shareVar = 100;
		st2.print();

		SingleTone st3 = SingleTone.getInstance();
		st3.shareVar = 200;
		st3.print();

		//싱글톤 인스턴스이므로 동일한 참조값이 출력된다.
		System.out.println(String.format("st2의 주소 : %s", st2));
		System.out.println(String.format("st3의 주소 : %s", st3));
		
		/*
		결국 동일한 인스턴스를 사용한 것이므로 마지막에 할당된 값이 출력됨
		 */
		System.out.println(String.format("st2의 shareVar: %d", st2.shareVar));
		System.out.println(String.format("st3의 shareVar: %d", st3.shareVar));

	}
}
