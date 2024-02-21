import java.util.Scanner;

public class ToOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        // n이 1이면 수행 종료
        while (n != 1) {
            // k가 n의 배수이면 나누기
            if (n % k == 0) {
                n /= k;
                cnt++;
            }
            // k가 n의 배수이면 나누지 않기
            else {
                n -= 1;
                cnt++;
                n /= k;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
