import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumberCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력 받을 객체
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[n][m];
        int result = Integer.MIN_VALUE; // 정수 중 가장 최솟값
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                // 각 행의 최솟값을 찾는 방법
                int min = Arrays.stream(arr[i]).min().getAsInt();
                // 각 행의 최솟값들 비교,
                result = Math.max(result, min);
            }
        }
        System.out.println(result);
        sc.close();
    }
}
