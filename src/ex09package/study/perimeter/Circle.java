package ex09package.study.perimeter;

public class Circle {
	double rad;
	final double PI;

	public Circle(double rad) {
		this.rad = rad;
		PI = 3.14159;
	}
	
	
	//둘레 계산을 위한 멤버메서드

	public double getPerimieter() {
		return 2 * PI * rad;
	}
}
