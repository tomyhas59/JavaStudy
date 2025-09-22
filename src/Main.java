import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // 배열을 넘길 때 new int[]로 배열을 전달
        sumArray(new int[]{1, 3, 4, 5});  // 예시로 1, 3, 4, 5의 합을 구해
    }

    static int sumArray(int[] param) {
        int sum = Arrays.stream(param).sum();  // sum()으로 합 구하기
        System.out.println("Sum: " + sum);  // 합 출력
        return sum;
    }
}
