import java.util.*;

public class StackJava {

    public static void main(String[] args) {
        // 정수형 스택 리스트 생성
        Stack<Integer> stackInt = new Stack<>();

        stackInt.push(5);
        stackInt.push(2);
        stackInt.push(3);
        stackInt.push(7);

        stackInt.pop();

        stackInt.push(1);
        stackInt.push(4);

        stackInt.pop();

        // 최상단 부터 보기
        while (!stackInt.isEmpty()) {
            System.out.println(stackInt.pop()); // 꺼내고 출력까지
        }

    }
}