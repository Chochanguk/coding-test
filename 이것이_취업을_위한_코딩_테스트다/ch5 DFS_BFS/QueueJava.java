import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueJava {
    public static void main(String[] args) {
        // 자바에선 링크드 리스트로 큐를 구현해야함!!
        Queue<Integer> qInteger = new LinkedList<>();
        Stack<Integer> reverseQueue = new Stack<>();

        qInteger.offer(5);
        qInteger.offer(2);
        qInteger.offer(3);
        qInteger.offer(7);

        qInteger.poll();

        qInteger.offer(1);
        qInteger.offer(4);

        qInteger.poll();

        // 원래 방향으로 큐의 내용 출력
        System.out.println("큐의 원래 내용:");
        for (Integer num : qInteger) {
            System.out.print(num + " ");
            reverseQueue.push(num); // 동시에 스택에 추가하여 역순 준비
        }
        System.out.println();
        // 역순으로 출력
        System.out.println("큐의 역순 출력:");
        while (!reverseQueue.isEmpty()) {
            System.out.print(reverseQueue.pop() + " ");
        }
    }

}
