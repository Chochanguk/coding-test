# 파이썬의 재귀함수를 이용해서 구한 fatorial
# n = int(input())


def recursive_factorial(n):
    # n은 끝이 " "로 출력("\n" 출력이 아님)

    if n <= 1:
        print(n)
        return 1
    else:
        print(n, end=" ")
        return recursive_factorial(n - 1) * n


# 함수 호출 및 결과 출력
print(recursive_factorial(5))
