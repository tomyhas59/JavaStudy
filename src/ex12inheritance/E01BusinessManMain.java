package ex12inheritance;

class Man {
	private String name;

	public Man() {
		System.out.println("Man 클래스 디폴트 생성자 호출됨");

	}

	public Man(String name) {
		this.name = name;
		System.out.println("Man 클래스 인자 생성자 호출됨");

	}
	
	public void tellYourName() {
		System.out.println("내 이름은" + name + "입니다");

	}

}

class BusinessMan extends Man {
	private String company;
	private String position;

	public BusinessMan(String name, String company, String position) {
		
		/*
		 상속받은 자식클래스는 부모클래스의 생성자를 호출하여 부모 인스턴스가 
		 메모리에 먼저 생성되도록 해야 한다.
		 super()는 부모 클래스의 생성자를 호출해준다.
		 만약 super()를 기술하지 않으면 컴파일러에 의해 자동으로 삽입되어
		 디폴트 생성자를 호출하게 된다.
		 */
		super(name);
		this.company = company;
		this.position = position;
		System.out.println("BusinessMan 생성자 호출");

	}

	public void tellYourInfo() {
	
		System.out.println("회사명은" + company + "입니다.");
		System.out.println("직급은" + position + "입니다.");
		
		/*
		 부모 클래스의 멤버변수 name은 private로 선언됨
		 상속받은 자식클래스는 접근 불가.
		 private 멤버는 무조건 자신의 클래스 내부에서만 접근 가능
		 */
//		System.out.println("이름은" + name + "입니다.");//에러
		
		//멤버메서드를 통해 간접적으로 접근해야 함
		tellYourName();
	}
}

public class E01BusinessManMain {

	public static void main(String[] args) {
		BusinessMan man1 = new BusinessMan("김천국", "NAVER", "팀장");
		BusinessMan man2 = new BusinessMan("이낙원", "DAUM", "부장");

		man1.tellYourInfo();
		man1.tellYourName();
		
		man2.tellYourInfo();
		man2.tellYourName();
	}

}
