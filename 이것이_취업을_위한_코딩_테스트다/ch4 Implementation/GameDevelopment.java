import java.util.Scanner;

public class GameDevelopment {

    // 플레이어 위치
    public static int x, y;
    // 플레이어 초기 방향
    public static int d;

    // 북,동,남,서 이동 좌표
    public static int[] dx = { -1, 0, 1, 0 };
    public static int[] dy = { 0, 1, 0, -1 };
    // 맵 위치 입력
    public static int[][] map = new int[50][50];
    // 방문한 위치 정보
    public static int[][] location = new int[50][50];

    public static void turn_left() {
        // 왼쪽 이동
        d -= 1;
        // -1이면 한바퀴 돌기
        if (d == -1)
            d = 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 맵크기
        int n = sc.nextInt();
        int m = sc.nextInt();
        // 플레이어 위치
        x = sc.nextInt();
        y = sc.nextInt();
        // 방향 입력 받기
        d = sc.nextInt();

        // 전체 맵 정보를 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        // 플레이어 위치 방문처리
        location[x][y] = 1;
        // 방문횟수
        int cnt = 1;
        // 회전 횟수
        int turn_cnt = 0;
        while (true) {
            // 1. 현재 방향에서 왼쪽 방향 부터 탐색->우선 왼쪽 회전
            turn_left();
            ++turn_cnt;
            // 회전한 곳의 위치
            int nextX = x + dx[d];
            int nextY = y + dy[d];
            // 2. 왼쪽에 가보지 못한 곳이 존재하면 한칸 전진
            if (location[nextX][nextY] == 0 && map[nextX][nextY] == 0) {
                // 방문 처리
                location[nextX][nextY] = 1;
                // 플레이어 위치 변동
                x = nextX;
                y = nextY;
                // 방문 횟수 증가
                cnt++;
                turn_cnt = 0;// 회전횟수 초기화
                // 그 다음 왼쪽이 갈수 있는지 체크를 위해 다시 루프를 돔.
                continue;
            }
            // 3. 만약 4방향 모두 이미 가본칸이면
            if (turn_cnt == 4) {
                // 바라보는 방향 그대로 뒤로 1칸 돌아감.
                nextX = x - dx[d];
                nextY = y - dy[d];
                // 뒤쪽 방향이 바다인 칸이라 뒤로 못가는 경우 움직임 종료
                if (map[nextX][nextY] == 1) {
                    x = nextX;
                    y = nextY;
                } else {
                    break;
                }
                turn_cnt = 0; // 이동했으니 초기화

            }
        }
        System.out.println(cnt);
    }
}