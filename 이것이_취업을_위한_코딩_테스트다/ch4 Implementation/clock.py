# 시각 입력 받기
n = int(input())
cnt = 0

# 0~n까지
for h in range(n + 1):
    # 0~59까지
    for m in range(60):
        # 0~59까지
        for s in range(60):
            # 문자열로 바꾸고 문자열에 3이 있으면
            if "3" in str(h) + str(m) + str(s):
                cnt += 1

print(cnt)
