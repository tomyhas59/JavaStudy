package ex08class;

public class E02HumanMain {

	public static void main(String[] args) {
		
		/*
		 1. 클래스를 통해 인스턴스 생성. 참조변수(인스턴스형변수)는 스택에, 
		 	인스턴스는 힙에 생성 
		 */
		
		Human human = new Human();

		/*
		 2.인스턴스 초기화: 멤버변수를 통해 닷으로 접근하여 초기값을 할당.
		 */
		
		human.name = "마이클";
		human.age = 28;
		human.energy = 4;

		
		human.showState();
		human.eating();
		human.walking();
		human.thinking();
		human.showState();
		
		for (int i = 0; i <=20; i++) {
			human.walking();
		}
		
		
		human.showState();
		
		for (int i = 0; i <=20; i++) {
			human.eating();
		}
		
		human.showState();
	}

}
