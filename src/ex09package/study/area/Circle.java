package ex09package.study.area;

//원의 넓이를 계산하는 클래스
public class Circle {
	//멤버변수 : 반지름
	double rad;
	//멤버상수 : 원주율
	final double PI;

	//생성자
	public Circle(double rad) {
		//멤버변수 및 상수 초기화
		this.rad = rad;
		PI = 3.14159;
	}

	//멤버메서드
	public double getArea() {
		//원의 넓이 계싼
		return PI * rad * rad;
	}
}
