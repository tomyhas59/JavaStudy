package ex06array;

public class E02ArrayAndMethod {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] ref;
		System.out.println("초기화 직후 출력");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();

		/*
		 배열 변수는 Heap 영역에 생성된 배열의 참조값을 할당받게 된다.
		 따라서 출력 시 [@a 와 같은 형태가 된다.
		*/
		System.out.println("arr변수:" + arr);
		
		/*
		 배열명을 인수로 전달하는 것은 배열의 참조값을 전달하는 것으로 
		 배열 자체가 전달되지 않는다.
		 7은 기본 자로형이므로 값 자체가 전달된다.
		 */
		ref = addAllArray(arr, 7);

		/*
		 main에서 생성했던 배열 객체의 참조값을 매개변수로 전달하고 다시 
		 반환받았으므로 결국 
		 */
		System.out.println("메소드 호출 후 출력");
		for (int i = 0; i < ref.length; i++) {
			System.out.println(ref[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < ref.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}
		/*
		 매개변수로 전달된 배열의 참조값을 ar로 받게 되므로 
		 해당 메서드에서는 동일한 배열을 참조할 수 있게 된다.
		 즉 main에서 생성한 배열과 동일한 배열을 참조하게 된다.
		 */
	static int[] addAllArray(int[] ar, int addVal) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] += addVal;
		}

		return ar;
	}

}
