package ex05method;

public class E04MethodType03_2 {
	static void inputGugudan1(int sNum, int eNum) {
		int dan = sNum; 
		while(dan<=eNum) { 
			int su = 1; 
			while(su<=9) { 
				System.out.printf("%-2d*%-2d=%2d", dan, su, (dan*su));
				System.out.print(" ");
				su++;
			}
			System.out.println(); 
			dan++;
		}
	}
	
	static void inputGugudan2(int sNum, int eNum) {
		for(int dan=sNum ; dan<=eNum ; dan++) {
			for(int su=1 ; su<=9 ; su++) {
				System.out.print(dan +"*"+ su +"="+ (dan*su) +" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		inputGugudan1(3, 12);
		System.out.println("================================");
		inputGugudan2(5, 8);
	}
}
