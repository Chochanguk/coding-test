import java.util.ArrayList;
import java.util.Scanner;

//노드 정보
class Node {
    // 노드 번호
    private int index;
    // 간선 거리
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    // 인접 리스트 정보
    public void show() {
        System.out.print("(" + this.index + "," + this.distance + ") ");
    }
}

public class AdajacencyList {

    // 행(Row)이 n개인 인접 리스트 표현
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 노드의 개수(=그래프의 크기)
        int n = sc.nextInt();

        // 그래프 초기화
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Node>());
        }

        // 노드 0에 연결된 노드 정보 저장 (노드, 거리)
        graph.get(0).add(new Node(1, 7));
        graph.get(0).add(new Node(2, 5));

        // 노드 1에 연결된 노드 정보 저장 (노드, 거리)
        graph.get(1).add(new Node(0, 7));

        // 노드 2에 연결된 노드 정보 저장 (노드, 거리)
        graph.get(2).add(new Node(0, 5));

        // 그래프 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                graph.get(i).get(j).show();
            }
            System.out.println();
        }
    }
}
