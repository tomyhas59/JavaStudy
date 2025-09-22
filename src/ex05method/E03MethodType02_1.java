package ex05method;

public class E03MethodType02_1 {
	
	/*
	 public : 2개 이상의 클래스를 정의할 때 접근을 제어하기 위한 키워드
	 */
	  static int sum1To10(){
		  int sum=0;
		  for(int i=1;i<=10;i++) {
			  sum+=i;
		  }
		  return sum;
	  }
	  
	 
	public static void main(String[] args) {
	
			System.out.println("1~10까지의 합:" +sum1To10());
			
			int sum10=sum1To10();
			System.out.printf("1~10까지의 합은 %d입니다", sum10);
	}

}
