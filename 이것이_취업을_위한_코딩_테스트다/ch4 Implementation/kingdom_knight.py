data = input()
# ord 함수는 주어진 문자의 아스키 코드 값을 반환.
# a~h -> 1~8로 아스키 코드 후 정수형으로 고침
row = int(ord(data[0])) - int(ord("a")) + 1
col = int(data[1])  # 문자열을 정수형으로 고침.


# 나이트가 이동 가능한 좌표의 경우를 리스트로 표현
steps = [(-2, -1), (-2, 1), (-1, -2), (-1, 2), (1, -2), (1, 2), (2, -1), (2, 1)]

# 경우의 수
cnt = 0

for step in steps:
    next_row = row + step[1]
    next_col = col + step[0]
    if (next_row < 1) or (next_row > 8) or (next_col < 1) or (next_col > 8):
        continue
    else:
        cnt += 1

print(cnt)
