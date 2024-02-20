n=1260
count=0 # 해당 화폐로 거슬러 줄 수 있는 동전의 개수 세기
coin_types=[500,100,50,10] #큰 단위의 화폐부터 차례대로 확인

for coin in coin_types:
    # //: 파이썬에서의 정수 나눗셈 연산자(7//2=3)
    count=count+ (n // coin) # 1260/500=2
    n %=coin #n=260

print(count) 