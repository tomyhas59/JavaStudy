package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {
		// while
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0 || i % 7 == 0) {
				   if (i % 21 != 0) {
			            sum += i;
			            System.out.println(i); 
			        }
			}
			i++;

		}
		System.out.println(sum);

		// do~while
		// for
	}

}
