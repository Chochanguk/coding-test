import java.util.Scanner;

public class RecursiveJava {
    // 팩토리얼 메서드
    public static int recursiveFactorial(int n) {
        if (n <= 1)
            return 1;

        else
            return recursiveFactorial(n - 1) * n;
    }

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
    }
}
