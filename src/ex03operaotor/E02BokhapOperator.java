package ex03operaotor;

public class E02BokhapOperator {
	public static void main(String[] args) {
		double e = 3.1;
		e += 2.1;
		e *= 2;
		e += e;
		System.out.println("e의 결과값:" + e);

		int n = 5;
//		n = n * 2.7;
		n = (int) (n * 2.7);
		n *= 2.7;
		System.out.println("n의 결과값: " + n);
		
	
	}
}
