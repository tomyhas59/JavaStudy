package ex11static;

/*
 Static variable (정적변수)
 -멤버변수에 static을 붙이면 정적변수로 선언된다.
 -정적변수는 JVM(자바가상머신)에 의해 프로그램이 시작되는 시점에 초기화된다.
 -main() 메서드가 실행되기 전에 초기화되므로 main() 메서드 실생 시 별도의 선언 없이 
 변수를 즉시 사용할 수 있다.
 
 접근 방법
 -클래스 내부
 :변수명으로 일반적인 멤버변수와 동일하게 접근할 수 있다.
 -클래스외부
 1.인스턴스 변수를 통해 접근한다.(권장사항 아님)
 2. 인스턴스 생성 없이 클래스명으로 직접 접근한다.(권장사항)
 -메서드 앞에서 static을 붙이면 정적 메서드가 된다. 
 정적변수와 모든 특성이 동일하다.
  */

class MyStatic {
	/*
	 멤버변수: 인스턴스형 멤버변수는 반드시 클래스의 인스턴스를 생성한 후 
	 참조변수를 통해 접근해야 한다.
	 즉 일반적인 멤버변수는 인스턴스를 생성하는 시점에 메모리에 로드된다.
	 (멤버변수는 Stack영역에, 인스턴스는 Heap영역에 생성됨.
	 */
	int instanceVar;
	
	/*
	 정적변수: 인스턴스를 생성할 필요 없이 클래스명으로 바로 접근할 수 있다.
	 JVM이 프로그램을 시작할 때 미리 메모리(Method영역)에 로드된다.
	 */
	static int staticVar;

	/*
	 인스턴스형 멤버메서드 : 인스턴스형 메서드에서는 모든 멤버를 사용할 수 있다.
	 인스턴스형 멤버, 정적 멤버 모두 접근할 수 있다.
	 */

	void instanceMethod() {
		System.out.println("instanceVar=" + instanceVar);
		System.out.println("staticVar=" + staticVar);
		staticMethod();
	}

	/*
	 정적 멤버 메서드: 
	 정적 메서드 내부에서는 인스턴스형 멤버에는 접근할 수 없다. 
	 정적 멤버만 접근할 수 있다.
	 (※main 메서드에서는 static으로 선언된 메서드만 호출할 수 있었던 것을 기억하자)
	 */
	static void staticMethod() {
		//System.out.println("instanceVar=" + instanceVar);//에러
		System.out.println("staticVar=" + staticVar);
		//instanceMethod(); //에러
	}
}

public class E01StaticModifier {


	public static void main(String[] args) {
		/*
		 일반적인 멤버변수에 접근하는 방법: 
		 Mystatic 클래스의 인스턴스를 생성 후 참조변수를 통해 접근
		 */
		MyStatic myStatic = new MyStatic();
		myStatic.instanceVar = 100;
		System.out.println("myStatic.instanceVar=" + myStatic.instanceVar);

		/*
		 정적 변수 접근 방법: 클래스명을 통해 바로 접근 가능
		 인스턴스 생성하지 않고 바로 사용 가능
		 */
		MyStatic.staticVar = 200;
		System.out.println("MyStatic.statciVar=" + MyStatic.staticVar);

		/*
		 정적변수도 일반적인 멤버변수처럼 참조변수를 통해 접근할 수 있지만 
		 Java에서는 권장하지 않는다.
		 (※참조변수를 통해 접근할 거면 굳이 정적변수를 사용할 이유가 없기 때문)
		 */
		myStatic.staticVar = 300;
		System.out.println("myStatic.staticVar=" + myStatic.staticVar);

		////////////////////////////////////////////////

		/*
		2개의 인스턴스를 생성, 메모리(Heap영역)에는 ms1, ms2의 인스턴스가 각각 생성
		 */
		MyStatic ms1 = new MyStatic();
		MyStatic ms2 = new MyStatic();

		/*
		인스턴스형 변수는 각각의 인스턴스 내부에 존재하므로 아래 2개의 값은 서로 다르게 출력됨
		 */
		ms1.instanceVar = 100;
		ms2.instanceVar = 1000;

		System.out.println("ms1.instanceVar=" + ms1.instanceVar); // 100
		System.out.println("ms2.instanceVar=" + ms2.instanceVar);// 1000

		/*
		하지만 정적 변수는 메모리에(Method영역)에 딱 하나만 생성되므로 어떤 인스턴스 변수로 접근하든 
		동일한 메모리를 가리키게 된다.
		따라서 값을 공유하게 되므로 동일한 결과를 출력한다. 
		 */
		ms1.staticVar = 800;
		ms2.staticVar = 900;

		System.out.println("ms1.staticVar=" + ms1.staticVar); // 900
		System.out.println("ms2.staticVar=" + ms2.staticVar); // 900

		
		//메서드 접근 방법도 정적 변수와 동일
		myStatic.instanceMethod();
		myStatic.staticMethod();

		//MyStatic.instanceMethod();//에러
		MyStatic.staticMethod();
		/*
		결론: 일반적인 인스턴스형 멤버는 인스턴스의 참조변수를 통해 접근한다.
		정적 멤버는 클래스명을 통해 인스턴스 생성 없이 접근한다.
		 */
	}

}
