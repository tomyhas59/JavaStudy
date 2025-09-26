package ex11static;

class E02StaticBlockMain {
 
	/*
	:동일 클래스 내 main() 메서드보다 먼저 실행되는 블록으로 main() 메서드의 실행 
	코드가 없어도 먼저 실행된다.
	또한 생성자보다도 먼저 실행되는 특징이 있다.
	
	 */
	int instanceVar;
	void instanceMethod() {}
 
	static int staticVar;
	static void staticMethod() {
		int localVar;
		System.out.println("정적메소드");
	}
 
	//static 블록
	static {

		//블록 내에서 정적변수에 접근 가능
		staticVar = 1000;		
 
		/*
		 블록 내에서만 사용 가능한 변수, 블록 내에서는 일반변수 생성 가능
		 */
		int localVar;
		localVar = 1000;
		System.out.println("localVar="+ localVar);
		
		/*
		static 블록 내에서는 인스턴스형 멤버를 사용할 수 없다.
		 */
//		System.out.println("instanceVar="+ instanceVar);  
//		instanceMethod();
 
		System.out.println("staticVar="+ staticVar);
		staticMethod();
		
		System.out.println("===static block 끝===");
	}
 
	/*
	 생성자 메서드 정의 : 생성자에서는 정적 멤버에 접근이 가능 
	 일반적인 멤버변수와 동일
	 */
	public E02StaticBlockMain() {
 
		staticVar = -1;
		System.out.println("==StaticBlock의 생성자==");
	}
	public static void main(String[] args) {
		
		System.out.println("==메인메소드==");		
	 /*
	  static 블록 내에서 선언된 변수는 지역변수이므로 main() 메서드에서는 사용 불가.
	  static 블록 내에서만 사용 가능
	  */
	//	System.out.println("localVar="+ localVar); //에러
		 
		new E02StaticBlockMain();
	}
}

