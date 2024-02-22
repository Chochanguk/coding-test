import java.util.Scanner;

public class UpDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. n입력받기
        int n = sc.nextInt();
        // 2. 전에 입력 받았던거 버퍼에서 초기화 하기
        sc.nextLine();
        // 3. " ": 띄워쓰기로 구분하기
        String[] plans = sc.nextLine().split(" ");
        //x,y 좌표 초기화
        int x = 1;
        int y = 1;
    

        for (String plan : plans) {
            // 임시 좌표
            int nx = x;
            int ny = y;
            // 
            if (plan.equals("R")) {
                ny = y + 1;
            } else if (plan.equals("L")) {
                ny = y - 1;
            } else if (plan.equals("U")) {
                nx = x - 1;
            } else if (plan.equals("D")) {
                nx = x + 1;
            }
            // 공간을 벗어나는 경우 무시
            if (nx < 1 || ny < 1 || nx > n || ny > n)
                continue;

            // 실제 좌표 업데이트
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
        sc.close();
    }
}