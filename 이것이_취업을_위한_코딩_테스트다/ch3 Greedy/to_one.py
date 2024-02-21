# N, K을 공백을 기준으로 구분하여 입력 받기
n, k = map(int, input().split())
result = 0
cnt=0
while n!=1:
    #n이 k의 배수이면 그냥 나누기
    if(n%k==0):
        n//=k
        cnt+=1
    #n이 k의 배수가 아니면 빼고 나누기
    else :
        n-=1
        n//=k
        cnt+=2
print(cnt)
        