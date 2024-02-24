# deque라이브러리 사용
from collections import deque

# 큐 구현을 의한 deque 라이브러리 사용
queue = deque()

queue.append(5)
queue.append(2)
queue.append(3)
queue.append(7)

queue.popleft()

queue.append(1)
queue.append(4)

queue.popleft()

print(queue)  # 왼쪽부터 출력
queue.reverse()  # 오른쪽부터 출력을 위해 반대로 돌림
print(queue)  # 원래랑 반대로 출력
