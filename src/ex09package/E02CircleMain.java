package ex09package;

import ex09package.study.perimeter.Circle;

public class E02CircleMain {

	public static void main(String[] args) {
		//풀경로 새성
		ex09package.study.area.Circle circle = new ex09package.study.area.Circle((6.5));
		System.out.println("반지름이 6.5인 원의 넓이:" + circle.getArea());

		//임포트 생성
		Circle circle2 = new Circle(4.5);
		System.out.println("반지름이 4.5인 원의 둘레:" + circle2.getPerimieter());
	}

}
