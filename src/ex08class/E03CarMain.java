package ex08class;

class Car {
	String carModel;
	Human owner;

	void initialize() {
		carModel = "람보르기니";
		owner = new Human();
		owner.name = "스티브로져스";
		owner.age = 30;
		owner.energy = 10;
	}

	void initialize(String model, String name, int age, int energy) {
		carModel = model;
		owner = new Human();
		owner.name = name;
		owner.age = age;
		owner.energy = energy;
	}

	void drive() {
		System.out.println(owner.name + "이(가)" + carModel + "을 운전한다");
	}

	void showCarInfo() {
		System.out.println("[차량 정보]");
		System.out.printf("모델명:%s\n", carModel);
		owner.showState();
	}
}

public class E03CarMain {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.initialize();
		car1.showCarInfo();

		Car car2 = new Car();
		car2.carModel = "밴틀리";
		car2.owner = new Human();
		car2.owner.name = "토니스타크";
		car2.owner.age = 52;
		car2.owner.energy = 9;
		car2.showCarInfo();

		Car car3 = new Car();
		car3.initialize("스포츠카", "데이비드", 8, 10);
		car3.showCarInfo();

		Car car4 = new Car();
		car4.owner=new Human();
		
		car4.showCarInfo();
	}

}
