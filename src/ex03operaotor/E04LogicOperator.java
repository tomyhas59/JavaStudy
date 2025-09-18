package ex03operaotor;

public class E04LogicOperator {

	public static void main(String[] args) {
		int num1=10, num2=20;
		
		boolean result1= (num1==100 && num2==20);
		boolean result2= (num1<12 || num2>=30);
		
		System.out.println("result1의 결과:" + result1);
		System.out.println("result2의 결과:" + result2);
		
		if(!(num1==num2)) {
			System.out.println("num1과 num2는 다르다");
		}else {
			System.out.println("num1과 num2는 같다");
		}
	}

}
