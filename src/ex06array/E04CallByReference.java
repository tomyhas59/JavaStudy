package ex06array;

public class E04CallByReference {

	public static void main(String[] args) {
		int[] arr = { 100, 200 };
		System.out.println("[메인메소드]-Swap전 출력");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();

		callByReference(arr);

		System.out.println("[메인메소드]-Swap 이후 출력");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

	static void callByReference(int[] ref) {
		int temp;
		temp = ref[0];
		ref[0] = ref[1];
		ref[1] = temp;
		System.out.println("[callByReference메소드]-Swap 이후 출력");
		for (int i = 0; i < ref.length; i++) {
			System.out.println(ref[i] + " ");
		}
		System.out.println();
	}

}
