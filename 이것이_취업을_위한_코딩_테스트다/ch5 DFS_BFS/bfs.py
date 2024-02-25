from collections import deque


# BFS 메서드 정의
def bfs(graph, start, visted):
    # 시작 노드를 큐에 집어 넣음
    queue = deque([start])
    # 현재 노드를 방문처리
    visted[start] = True
    # 큐가 빌때까지 반복
    while queue:
        # 큐에서 원소하나 출력(FIFO)
        v = queue.popleft()
        print(v, end=" ")
        # 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
        for i in graph[v]:
            if not visted[i]:
                visted[i] = True
                queue.append(i)


# 각 노드가 연결된 정보를 리스트 자료형으로 표현(2차원 리스트)
graph = [[], [2, 3, 8], [1, 7], [1, 4, 5], [3, 5], [3, 4], [7], [2, 6, 8], [1, 7]]

# 각 노드가 방문된 정보를 리스트 자료형으로 표현(1차원 리스트)
visited = [False] * 9

# 정의된 BFS 함수 호출
bfs(graph, 1, visited)
