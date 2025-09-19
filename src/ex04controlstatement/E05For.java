package ex04controlstatement;

public class E05For {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			System.out.println("i=" +i);
		   }
		
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println("1~100까지의 합: "+sum);
	}
	

}
