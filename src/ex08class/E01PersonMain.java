package ex08class;

/*
 추상화(abstraction) : 현실세계의 사물을 클래스로 형상화하는 것을 뜻한다.
 Person 클래스는 "사람"의 일반적인 사항을 클래스로 추상화하고 있다.
 */

/*
 클래스 선언 시 class 키워드를 사용한다. 클래스명의 첫 글자는 반드시 대문자로 
 기술해야 한다. 또한 public 접근지정자는 Java 파일 내에서 한 번만 사용할 수 있다.
 public으로 선언되는 클래스명은 해당 파일명과 일치해야 한다.
 */

class Person {
	String name = "정우성";
	int age = 47;
	String gender = "남자";
	String job = "영화배우";

	void eat() {
		System.out.println(name + "가(이) 식사를 한다");
	}

	void sleep() {
		System.out.println("나이가" + age + " 인 " + name + "가(이) 잠자고 있다");
	}
}

public class E01PersonMain {

	public static void main(String[] args) {

		/*
		 * Person 클래스를 통해 인스턴스 생성. 생성 시 할당된 참조값을 반환하고 좌측항의 참조변수가 그 값을 받음.
		 */
		Person person = new Person();

		System.out.println("person=" + person);

		// 인스턴스 변수를 통해 멤버 메서드 호출 가능.
		person.eat();
		person.sleep();

		// 인스턴스 생성 직후 참조변수를 사용하지 않아도 이와 같이 즉시 호출 가능
		new Person().eat();
		new Person().sleep();
	}

}
