package ex08class;

/*
 생성자(Constructor)
 :클래스를 인스턴스화 할 때 자동으로 호출되는 메서드
 개발자가 임의로 호출할 수 없다.
 반환값이 업다.
 따라서 선언 시 void를 사용하면 에러가 발생.
 생서자 내부에서는 다른 생성자를 호출할 수 없다.
 오버로딩을 통해 여러 개 정의할 수 있다.
 
 */
public class PersonConstructor {

	String name;
	int age;
	String addr;

	/*
	 * 디폴트 생성자: 클래스를 만들 때 생성자를 정의하지 않으면 
	 * 아래와 같이 매개변수화 실행부가 없는 생성자가 자동으로 삽입된다. 
	 * 지금까지 new 클래스명()과 같이 사용했던 문장이 바로 디폴트 생성자를 호출하여 
	 * 인스턴스를 생성하는 것이었다.
	 */

	// public PersonConstructor(){}

	// 생성자1 : 매개변수가 없는 생성자
	public PersonConstructor() {
		name = "이름없음";
		age = 1;
		addr = "미상";
		System.out.println("나는 기본 생성자입니다");

	}

	// 생성자2 : 매개변수가 있는 생성자
	public PersonConstructor(String name) {
		/*
		 * this는 멤버변수와 매개변수를 구분하기 위한 용도로 사용된다. 
		 * 클래스 자신, 즉 멤버를 가리킨다.
		 */
		this.name = name;
		age = 1;
		addr = "출처 불명";
		System.out.println("나는 인자생성자[1]입니다");

	}

	// 생성자3 :
	public PersonConstructor(String name, int age) {
		/*
		 * this()는 생성자 내에서 다른 생성자를 호출할 때 사용한다. 
		 * 단, 생성자 내에서만 사용할 수 있고 일반 멤버메서드에서는 사용 불가
		 */
		// 매개변수가 3개인 생성자를 자동 호출
		this(name, age, "미상");
		System.out.println("나는 인자생성자[2]입니다");

	}

	public PersonConstructor(String _name, int age, String addr) {
		// 매개변수와 멤버변수명이 다르면 this를 사용하지 않아도 된다.
		name = _name;
		// 둘의 이름이 동일하면 this 사용 권장
		this.age = age;
		this.addr = addr;
		System.out.println("나나는 인자생성자[3]입니다");

	}

	// 초기화를 위한 멤버메서드
	void initialize(String name, int age, String addr) {

		// (name, age, "미상"); ->에러 발생

		// 멤버변수 구분을 위한 this는 멤버메서드에서도 사용 가능
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	void showPersonInfo() {
		System.out.printf("%s 님의 정보 \n", this.name);
		System.out.printf("나이:%d\n", age);
		System.out.printf("주소:%s\n", addr);

	}

}
