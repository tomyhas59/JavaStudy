package ex02variable;

public class E05ConstantVar {

	public static void main(String[] args) {
		final double PI = 3.14;
		System.out.println("PI = "  +PI);

//		PI = 3.141592;

		final String NICK_NAME;
//		System.out.println("우리는" + NICK_NAME);
		NICK_NAME = "개발자";
		System.out.println("우리는 " + NICK_NAME);

		final int SCISSOR = 1;
		final int ROCK = 2;
		final int PAPER = 3;

		int computer, user;

		computer = 1;
		user = 3;
		System.out.println("컴퓨터 승");

		computer = SCISSOR;
		user = PAPER;
		System.out.println("computer win");
		
	
	}
	
	public int num=22;
	
}



