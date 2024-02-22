import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;
        for (int h = 0; h <= n; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    // 둘째자리가 3이면
                    if ((h / 10) == 3 || (m / 10) == 3 || (s / 10) == 3) {
                        cnt++;
                    }
                    // 첫째자리가 3이면
                    else if ((h % 10) == 3 || (m % 10) == 3 || (s % 10) == 3) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);

    }
}
