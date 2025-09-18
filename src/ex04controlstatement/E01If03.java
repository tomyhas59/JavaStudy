package ex04controlstatement;

public class E01If03 {

	public static void main(String[] args) {
         int kor=90, eng=66, math=65;
         double avg= (kor+eng+math)/3.0;
         
         System.out.println("평균 점수는(그대로) :" + avg);
         System.out.printf("평균 점수는(소수2자리) : %.2f\n" , avg);
         
         if(avg>=90) System.out.println("A");
         else if(avg>=80) System.out.println("B");
         else if(avg>=70) System.out.println("C");
         else if(avg>=60) System.out.println("D");
         else System.out.println("F 학사 경고");

         System.out.println("잘못된 조건식의 if문");
         if(avg>=60) System.out.println("D");
         else if(avg>=70) System.out.println("C");
         else if(avg>=80) System.out.println("B");
         else if(avg>=90) System.out.println("A");
         else System.out.println("F 학사 경고");
         
         
         System.out.println("점수의 구간을 조건으로 사용");
         if(avg>=60 && avg<70) System.out.println("D");
         else if(avg>=70 && avg<80) System.out.println("C");
         else if(avg>=80 && avg<90) System.out.println("B");
         else if(avg>=90 ) System.out.println("A");
         else System.out.println("F 학사 경고");
         
         
	}

}
