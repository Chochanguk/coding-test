# nxn 정사각형
n = int(input())
# " "으로 구분해서 입력받기
plans = input().split()
x, y = 1, 1

for plan in plans:
    # 임시 좌표
    nx, ny = x, y

    if plan == "R":
        ny = y + 1
    elif plan == "L":
        ny = y - 1
    elif plan == "U":
        nx = x - 1
    elif plan == "D":
        nx = x + 1

    # 공간을 벗어나는 경우 무시
    if nx < 1 or ny < 1 or nx > n or ny > n:
        continue
    # 실제 좌표 업데이트
    x, y = nx, ny

print(x, y)
