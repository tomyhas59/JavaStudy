package ex06array;

public class E07ForEachBasic {

	public static void main(String[] args) {
	   int[] arr= {1,2,3,4,5};
	   int sum=0;
	   for (int i = 0; i < arr.length; i++) {
		sum+=arr[i];
	}
	   System.out.println("기본 for문을 이용한 합계:"+sum);
	   
	   
	   sum=0;
	   for (int i : arr) {
		System.out.println(i+" ");
		sum+=i;
	}
	   	   
	   System.out.println("\nforeach문을 이용한 합계:"+sum);
	   
	   System.out.println("배열 arr의 요소값 1 증가시키기");
	   for (int b : arr) {
		b++;
		System.out.println(b+" ");
	}
	   
	   System.out.println();
	   System.out.println("배열 arr의 요소 재출력하기");
	   
	   for (int c : arr) {
		System.out.println(c+" ");
	}
	   System.out.println();
	   
	   System.out.println("2차원 배열을 foreach문으로 출력하기");
	   int [][] twoDim= {
			   {1,2,3,4},{10,20,30,40},{100,200,300,400}
			   
	   };
	   for (int[] a : twoDim) {
		for(int b: a) {
			System.out.println(b+" ");
			
		}
		System.out.println();
	}
	}

}
