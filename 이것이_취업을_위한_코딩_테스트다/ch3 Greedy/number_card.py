# N, M를 공백을 기준으로 구분하여 입력 받기
n, m = map(int, input().split())
result=0
# i는 0부터 n-1 까지
for i in range(n) :
    #한줄 입력 받아서 리스트로 변환(m개 입력)
    data=list(map(int,input().split()))
    #리스트 중 가장 작은 값
    min_row = min(data)
    #작은 수 중 제일 큰 값 찾기
    result=max(result,min_row)
print(result) #결과 출력