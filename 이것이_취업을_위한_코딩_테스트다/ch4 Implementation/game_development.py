# n,m을 공백으로 받기
n, m = map(int, input().split())

# x,y,direction를 공백으로 받기
x, y, direction = map(int, input().split())

# 플레이어가 이동할 거리(북,동,남,서)
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]


# 플레이어가 방문할 위치 0으로 초기화
location = []  # 빈 리스트를 생성
for i in range(n):  # n번 반복
    row = []  # 각 행을 위한 임시 리스트
    for j in range(m):  # m번 반복
        row.append(0)  # 임시 리스트에 0을 m번 추가
    location.append(row)  # 완성된 행을 d에 추가

# 플레이어 위치 방문처리
location[x][y] = 1

# 전체 맵 정보 받기
game_map = []
for i in range(n):
    game_map.append(list(map(int, input().split())))


# 왼쪽으로 회전 함수
def turn_letf():
    # global: 전역 변수 참조시
    global direction
    direction -= 1
    if direction == -1:
        direction = 3


# 시뮬레이션 시작
cnt = 1  # 방문 횟수
turn_cnt = 0  # 회전 횟수

while True:
    # 1. 왼쪽 방향 돌기
    turn_letf()
    turn_cnt += 1
    # 플레이어가 이동할 위치 변경
    nextX = x + dx[direction]
    nextY = y + dy[direction]
    # 2. 왼쪽 방향에서 가보지 못한 칸이 있고 육지이면 1칸 전진(방문) 후 재탐색
    if location[nextX][nextY] == 0 and game_map[nextX][nextY] == 0:
        # 방문 처리
        location[nextX][nextY] = 1
        # 플레이어 위치 변동(한칸 전진)
        x = nextX
        y = nextY
        # 방문 횟수 증가
        cnt += 1
        # 회전 횟수 초기화
        turn_cnt = 0
        # 다시 재탐색
        continue
    # 3. 4방향 모두 가본칸 이면 바라보는 방향 유지한채로 1칸 뒤로가기
    if turn_cnt == 4:
        # 플레이어 이동
        nextX = x - dx[direction]
        nextY = y - dy[direction]
        # 3-2. 뒤쪽 방향으로 움직이면 플레이어 위치 변경
        if game_map[nextX][nextY] == 0:
            x = nextX
            y = nextY
        # 3-3. 뒤쪽 방향이 바다라 못 움직이면 게임 종료
        else:
            break
        # 플레이어 회전 횟수 초기화
        turn_cnt = 0

print(cnt)
