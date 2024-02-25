graph = [
    [],  # 0
    [2, 3, 8],  # 1
    [1, 7],  # 2
    [1, 4, 5],  # 3
    [3, 5],  # 4
    [3, 4],  # 5
    [7],  # 6
    [2, 6, 8],  # 7
    [1, 7],  # 8
]

# 풀이1. 재귀함수로 푸는 DFS


# 그래프, 시작 노드, 방문 노드
def dfs_recursive(graph, v, visited):
    # 1. 현재 노드를 방문 처리 및 출력
    visited[v] = True
    print(v, end=" ")
    # 2. 해당 노드의 인접 노드 탐색
    for i in graph[v]:
        # 3. 인접노드가 방문하지 않은 상태면 해당 노드를 dfs 실행
        if not visited[i]:
            dfs_recursive(graph, i, visited)
        # 4. 인접노드가 모두 방문하면 재귀 종료됨.


visited = [False] * 9

dfs_recursive(graph, 1, visited)
print("\n")


# 풀이2. 스택을 이용한 깊이 우선 탐색(DFS) 구현
def dfs_stack(graph, v, visited_stack):
    stack = [v]  # 시작 노드 v를 스택에 추가합니다.

    while stack:  # 스택에 노드가 없어질때까지
        v = stack.pop()  # 스택에서 하나의 노드를 꺼내고, 탐색한다.
        if not visited_stack[v]:  # 만약 현재 노드를 아직 방문하지 않았다면,
            visited_stack[v] = True  # 방문 처리.
            print(v, end=" ")  # 방문한 노드를 출력.
            # 방문 노드의 인접노드 스택에 넣기 위한 탐색시작
            # 스택에 넣을 예정이므로 반대부터 탐색 후 넣기
            for adjacent_node in reversed(graph[v]):
                if not visited_stack[adjacent_node]:  # 인접한 노드가 방문되지 않았다면,
                    stack.append(adjacent_node)  # 스택에 추가.


# 모든 노드를 처음에는 '방문하지 않음'으로 초기화 하기.
visited_stack = [False] * 9
dfs_stack(graph, 1, visited_stack)
