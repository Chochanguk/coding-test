import java.util.Scanner;

public class KingdomKnight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputData = sc.nextLine();

        int row = inputData.charAt(0) - 'a' + 1;// 행: a~h->1~8
        int col = inputData.charAt(1) - '0'; // 열:1~8

        // 나이트가 이동할 수 있는 8가지 방향 정의
        int[] dx = { -2, -2, -1, -1, 2, 2, 1, 1 };
        int[] dy = { -1, 1, -2, 2, -1, 1, -2, 2 };

        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            int nextRow = row + dx[i];
            int nextCol = col + dy[i];

            // 범주밖이면 다음걸로 진행
            if (nextRow < 1 || nextRow > 8 || nextCol < 1 || nextRow > 8) {
                continue;
            }
            ++cnt;
        }
        sc.close();
        System.out.println(cnt);

    }
}
