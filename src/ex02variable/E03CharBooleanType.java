package ex02variable;

public class E03CharBooleanType {

	public static void main(String[] args) {
	 char ch1='가';
/*	 char chStr='가나다라';*/
	 
	 String chStr="가나다라";
	 
	 System.out.println("ch1=" +ch1);
	 System.out.println("chStr=" +chStr);
	     
	 
	 /*
	  아스키코드: 1byte로 표현할 수 있는 문자로 영어, 숫자를 십진수로 정의한 것
	  ex) A-> 65, a->97
	  유니코드: 1byte로 표현할 수 없는 문자로 영어, 숫자를 제외한
	  모든 문자를 2byte로 표현한다. 
	  유니코드는 보통 숫자가 크므로 16진수로 표현한다.
	  */
	 char ch2='A';
	 int num1=2;
	 int num2= ch2+num1;
	 	 
	 System.out.println("num2=" + num2);
	 System.out.println("(char)num2=" + (char)num2);
	 
	 char ch3= (char)(ch2+num1);
		 
	 System.out.println("ch3(문자출력)=>" +ch3);
	 System.out.println("ch(아스키코드출력)=>" +(int) ch3);
	 
	 char ch4='1';
	 char ch4_1='1'+1;
	 System.out.println("ch4=" +ch4 +", ch4_1=" +ch4_1 +" ,ch4_1=" +(int)ch4_1);
	 
	 boolean bn1=true;
	 boolean bn2=false;
	 System.out.println("bn1=" + bn1 +", bn2=" +bn2);
	 
	 boolean bn3= bn1 && bn2;
	 System.out.println("bn3(And)=" + bn3);
	 bn3= bn1 || bn2;
	 System.out.println("bn3(Or)=" +bn3);
	 
	 //문자 '가'는 유니코드 44032로 표현되므로 true를 반환
	 bn3= '가' >30000;
	 System.out.println("bn3=" +bn3);
			 
	 
	}



}
