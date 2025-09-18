package ex03operaotor;

public class E05ShortCircuitEvaluation {

	public static void main(String[] args) {
   int num1=0, num2=0;
   boolean result;
   result =(num1+=10) <0 && (num2+=10)>0;
   System.out.println("result=" +result);
   System.out.println("num1= " + num1 + ", num2=" + num2);
   
   result =(num1+=10) >0 || (num2+=10)>0;
   System.out.println("result=" +result);
   System.out.println("num1= " + num1 + ", num2=" + num2);
   
   //조건이 맞으면 뒤의 조건은 실행 x
	}

}
